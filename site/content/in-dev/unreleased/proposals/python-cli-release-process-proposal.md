# Apache Polaris Python CLI Release Process Proposal

## 1. Overview
The Apache Polaris Python Command Line Interface (CLI) provides a thin wrapper over the generated Python SDK for the Polaris management and catalog APIs. It allows administrators and integrators to:

- Discover and manage Polaris catalogs, tenants, and principals from local scripts or CI.
- Execute bootstrap tasks such as seeding an Iceberg REST catalog, registering AWS credentials, and testing connectivity.
- Scaffold configuration files for service operators using the templates that ship with the repository.

Publishing the CLI to the Python Package Index (PyPI) makes installation and upgrades dramatically easier for downstream users who rely on standard Python tooling (e.g., `pip`, `pipx`, and Poetry). A formally released CLI on PyPI ensures that:

- The community can install a vetted, signed build from a trusted channel without cloning the full source tree.
- Automated systems (container images, CI workflows, infrastructure-as-code) can depend on semantic versions rather than ad-hoc commits.
- The project complies with the ASF distribution model by providing convenience binaries that match the voted release sources.

## 2. Pre-requisites
Before we can ship an initial PyPI release we must close the remaining gaps below. These items should be completed prior to cutting a release candidate so they can be validated during the vote.

### 2.1 Package identity and metadata
- **Rename the distribution**: The name `polaris` is already taken on PyPI. We need to agree on and update a conflict-free project name such as `apache-polaris` or `apache-polaris-cli`. This requires updating `pyproject.toml`, import paths (if they should match the new name), entry-point definitions, documentation, and automation scripts.
- **Confirm semantic versioning**: Adopt a versioning scheme consistent with the wider Polaris project (e.g., align the CLI version with the server release it targets) and document the support policy.
- **Audit metadata**: Ensure the `readme`, homepage, issue tracker, license classifiers, and keywords are accurate and PyPI-compliant.

### 2.2 Build repeatability
- Verify that a clean `poetry build` (or `python -m build`) from the signed source release reproduces the wheel and source distribution without network access beyond downloading declared dependencies.
- Ensure the OpenAPI generated code is deterministic. We should pin the generator version (already done) and confirm the templates embed the ASF license header so that regenerated files remain compliant.

### 2.3 Testing and quality gates
- Finalize unit, integration, and end-to-end tests for the CLI. Extend automation so release candidates run the same checks the main branch uses (e.g., `pytest`, linting, type checking).
- Document manual validation steps (smoke test against a staging Polaris deployment).

### 2.4 Licensing and NOTICE obligations
- **License file**: The binary distribution must ship a full copy of the Apache License 2.0. We will place `client/python/LICENSE` in the repository and include it via the build backend so it lands inside both the sdist and wheel.
- **Notice file**: Create `client/python/NOTICE` describing the Apache Polaris CLI, crediting the ASF, and acknowledging bundled materials. Because the CLI packages generated code from OpenAPI Generator templates (licensed under Apache-2.0) we should explicitly mention that the generated client stubs originate from the Polaris OpenAPI specification processed by ASF-maintained templates. No third-party code is bundled directly, so no extra attributions are required beyond ASF notice statements.
- **Third-party dependencies**: At release time run `poetry export` (or `pip-licenses-cli`) to confirm all runtime dependencies are under approved licenses. Since we do not redistribute those dependencies inside the wheel, they do not need to appear in `NOTICE`, but the dependency report should be archived for the vote thread.
- **Source headers**: Confirm all first-party Python modules—including generated sources—carry the standard ASF header via the custom templates in `client/python/templates`.

### 2.5 Distribution layout
- Update packaging configuration so the wheel contains:
  - `cli/` entry-point modules
  - Generated SDK under `polaris/`
  - Template assets required at runtime
  - `LICENSE` and `NOTICE`
  - README and other documentation referenced by `pyproject.toml`
- Validate that `MANIFEST.in` (if used) or the `[tool.poetry] include` section covers the new legal files.

### 2.6 Credentials and access
- Identify at least two Apache Polaris PMC or committer accounts who will maintain the PyPI project.
- Open an ASF Infra JIRA ticket requesting creation of the PyPI project under the shared `apache` PyPI organization. Infra will either:
  - Assign the project to the ASF `apache` account and add nominated maintainers, or
  - Confirm that the PMC may self-register and link the project to the ASF federated PyPI group.
  We must complete this coordination before attempting to upload the first release.

## 3. Formal release process
Apache releases follow the ASF policy: only signed source archives voted on by the PMC are official releases. PyPI uploads are convenience binaries that must match the voted source.

### 3.1 Artifacts to produce
From the release-tagged source tree:
- **Source archive**: `apache-polaris-cli-<version>-source.tar.gz` + `.asc` + `.sha512` uploaded to `https://dist.apache.org/repos/dist/release/polaris/` after a successful vote.
- **Python distributions**: Build both a source distribution (`.tar.gz`) and a universal wheel (`.whl`). Each file must have accompanying GPG signature (`.asc`) and SHA-512 checksum even though PyPI itself will only store the artifacts. Keep copies in SVN alongside the source release for archival.

### 3.2 High-level release steps
1. **Prepare the release branch/tag**
   - Update changelog, version numbers, dependency pins, and ensure `LICENSE`/`NOTICE` are accurate.
   - Regenerate the OpenAPI client code from the voted OpenAPI specification.
   - Run the full test suite and document results.
2. **Stage artifacts**
   - Execute `poetry build` (or `python -m build`) to produce `dist/<name>-<version>.tar.gz` and `.whl`.
   - Generate SHA-512 checksums and sign each artifact: `gpg --armor --detach-sign dist/<artifact>` and `shasum -a 512 dist/<artifact> > dist/<artifact>.sha512`.
   - Upload the artifacts, signatures, checksums, and KEYS file to the `dist/dev/polaris/` Subversion staging area.
3. **Run the community vote**
   - Send a `[VOTE]` email to `dev@polaris.apache.org` including download links, checksums, `pip install` smoke-test instructions, and the dependency license summary.
   - After receiving at least three +1 PMC votes and no blocking issues, close the vote and call the result.
4. **Promote artifacts**
   - Move the staged artifacts from `dist/dev` to `dist/release` in Subversion.
   - Tag the release in Git (`rel/<version>`).
   - Publish release notes on the website.
5. **Publish to PyPI**
   - Using the shared ASF PyPI credentials (`apache` user via API token), run `twine upload dist/*` from the release workspace. PyPI does not host `.asc`/`.sha512`, but we must keep those files in SVN and link them in the announcement.
   - Verify the published metadata, download the wheel from PyPI, and run a sanity test (`pip install apache-polaris-cli && polaris --help`).
6. **Announce**
   - Send a `[ANNOUNCE]` email after PyPI propagation, referencing both the official source download and the convenience binary on PyPI.

### 3.3 Access management
- The PMC should maintain API tokens for the `apache` PyPI user in ASF password storage (not personal accounts).
- Add at least two release managers as project maintainers in PyPI to ensure redundancy.
- Document the credential rotation process in the private PMC wiki.

## 4. Nightly build strategy (TestPyPI)
To provide early access to unreleased features without polluting the official PyPI project:

1. **Versioning**: Adopt a nightly suffix such as `<next-version>.dev<YYYYMMDD>` generated from the commit timestamp.
2. **Automation**: Extend the existing CI (e.g., GitHub Actions) to run on `main` merges. Steps:
   - Checkout the repository, set up Python, and install Poetry.
   - Run the generators and tests to ensure the nightly artifact matches the branch state.
   - Build the distributions (`poetry build`).
   - Upload to TestPyPI using a token stored in ASF-managed GitHub secrets: `twine upload --repository testpypi dist/*`.
3. **Retention**: Optionally prune older nightly versions using the TestPyPI UI to avoid clutter.
4. **Consumption example**:
   ```bash
   python3 -m venv .venv
   source .venv/bin/activate
   python -m pip install --upgrade pip
   python -m pip install --index-url https://test.pypi.org/simple/ --extra-index-url https://pypi.org/simple/ apache-polaris-cli==<version>.dev20250101
   polaris --version
   ```
5. **Isolation from releases**: Nightly automation must never upload to the production PyPI project. Use separate API tokens, repositories (`testpypi`), and version numbers that clearly mark the build as non-voted.

## 5. Open items for discussion
- Final decision on package name and import path.
- Whether to continue using Poetry for packaging or transition to the PEP 517 `build` frontend to reduce bootstrap requirements.
- Definition of a support matrix (Python versions, Polaris server compatibility).
- Documentation hosting for CLI usage (ReadTheDocs vs. project website).

---
Prepared for discussion by the Apache Polaris community.
