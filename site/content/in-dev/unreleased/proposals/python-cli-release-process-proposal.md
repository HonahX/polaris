# Apache Polaris Python CLI Release Process Proposal

## 1. Overview
The Apache Polaris Python Command Line Interface (CLI) wraps the generated Python SDK for the Polaris management and catalog APIs so operators can script catalog administration, bootstrap Iceberg REST catalogs, and validate connectivity without cloning the full source tree. Packaging the CLI on the Python Package Index (PyPI) makes installation predictable for `pip`, `pipx`, and Poetry users, lets downstream automation depend on versioned releases, and still satisfies the ASF requirement that convenience binaries match the voted source artifacts described in the [ASF release policy](https://www.apache.org/legal/release-policy.html) and [release signing guidance](https://infra.apache.org/release-signing.html).

## 2. Pre-release prerequisites
Complete these items before proposing a release candidate so compliance can be verified during the vote as outlined in the [ASF release creation process](https://infra.apache.org/release-publishing.html).

### 2.1 Package identity and metadata
- **Rename the distribution**: The `polaris` name is occupied on PyPI. Select an available alternative (e.g., `apache-polaris-cli`), then update `pyproject.toml`, import roots, entry points, docs, and automation to use it.
- **Support matrix**: The CLI currently advertises `requires-python = ">=3.9,<4.0"`; update it to drop Python 3.9 support before the first release and document the supported versions alongside the CLI/server compatibility matrix (see `client/python/pyproject.toml`).
- **Metadata audit**: Refresh the long description, project URLs, license classifiers, and keywords to match the renamed distribution and Polaris branding.
- **Versioning**: Align CLI semantic versioning with the Polaris server releases so users can map compatibility at a glance.

### 2.2 Build, test, and automation readiness
- **Standard tooling**: Poetry is the definitive build backend and dependency manager for the CLI. `pyproject.toml` pins the Poetry requirement and the OpenAPI generator version so builds are reproducible.
- **Combined build and test flows**: The repository Makefile already orchestrates environment setup, linting, tests, license checks, and builds. Release managers can rely on the following recipes:
  ```bash
  make client-setup-env
  make client-unit-test client-build FORMAT=wheel
  make client-license-check
  ```
  These targets run under the pinned Poetry version inside the repo-managed virtualenv, ensuring local results match CI.
- **Deterministic generation**: Regenerate the OpenAPI client with the pinned generator before the vote and confirm the diff is empty to prove determinism.
- **Manual validation**: Smoke test the built wheel against a staging Polaris deployment, exercising authentication and catalog operations end-to-end.

### 2.3 Licensing, NOTICE, and compliance
- **ASF guidance**: Follow the ASF [licensing how-to](https://infra.apache.org/licensing-howto.html) for binary distributions—ship a full copy of the Apache License 2.0 and an appropriate NOTICE file alongside the wheel and sdist.
- **Legal artifacts**: Store `client/python/LICENSE` and `client/python/NOTICE` in the repository and keep them included through the `[tool.poetry] include` list so both sdists and wheels carry them (see Appendix A for the packaged layouts).
- **Generated sources**: OpenAPI Generator clarifies that templates are Apache-2.0 licensed while generated code is not automatically covered by the tool's license; by generating from ASF-owned templates and specs we retain ASF copyright and can apply the standard headers ([OpenAPI Generator README §3.4](https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/README.md#34---license-information-on-generated-code)).
- **License checks**: `pip-licenses-cli` is already configured for the client to verify that runtime dependencies use approved licenses, and we do not bundle third-party dependencies inside the published artifacts—only metadata references them. Preserve the dependency report for the vote thread even though NOTICE entries are unnecessary.

### 2.4 Access, credentials, and PyPI project setup
- **ASF policy**: Only the signed source archives published via ASF infrastructure constitute the official release; PyPI uploads remain convenience binaries and must be traceable back to the voted source (see the [ASF release policy](https://www.apache.org/legal/release-policy.html) and [release creation process](https://infra.apache.org/release-publishing.html)).
- **Infra coordination**: File an INFRA JIRA ticket if a new distribution target or directory is required—Infra uses those tickets to grant write access or create missing resources. Use the same channel to request PyPI project creation under the shared `apache` organization and add at least two PMC members as maintainers ([release publishing guide](https://infra.apache.org/release-publishing.html#distribution), [Infra contact page](https://infra.apache.org/contact.html)).
- **Credential storage**: Store the shared `apache` PyPI API token in ASF password management systems rather than personal vaults; document rotation expectations on the private PMC wiki.

## 3. Formal release process
Only signed source artifacts approved by a PMC vote qualify as Apache releases. Wheels and sdists uploaded to PyPI must match the voted source bits, carry matching version numbers, and be accompanied by signatures and checksums stored in the ASF dist repository (per the [ASF release policy](https://www.apache.org/legal/release-policy.html) and [release distribution guidance](https://infra.apache.org/release-publishing.html#distribution)).

### 3.1 Artifact list
- **Source release**: `apache-polaris-cli-<version>-source.tar.gz` plus `.asc` and `.sha512`, uploaded to `https://dist.apache.org/repos/dist/release/polaris/` after the vote succeeds.
- **Python distributions**: Build both an sdist and wheel via Poetry, then generate detached ASCII-armored signatures and SHA-512 checksums for each file. Retain the signatures and checksums in Subversion even though PyPI stores only the artifacts, and confirm the contents against Appendix A.
- **KEYS**: Update the `KEYS` file with new release manager public keys before staging so voters can verify signatures.

### 3.2 High-level workflow
1. **Prep the candidate**
   - Merge the package rename, Python support updates, changelog, and regenerated OpenAPI client into a release branch.
   - Confirm `make client-unit-test client-license-check client-build` passes locally and in CI.
2. **Stage artifacts**
   ```bash
   make client-build
   gpg --armor --detach-sign dist/*.whl dist/*.tar.gz
   shasum -a 512 dist/* > SHA512SUMS
   svn co https://dist.apache.org/repos/dist/dev/polaris tmp-dist
   cp dist/* tmp-dist/
   svn add tmp-dist/*
   svn commit -m "Polaris CLI <version> RC"
   ```
   These steps follow the ASF [release signing guidance](https://infra.apache.org/release-signing.html) for producing the required signatures and checksums.
3. **Community vote**
   - Start a 72-hour `[VOTE]` thread on `dev@polaris.apache.org` with links to staged artifacts, SHA-512 sums, GPG fingerprints, and the dependency license report.
   - Respond to review feedback, producing additional RCs if necessary.
4. **Promote the release**
   - Move artifacts from `dist/dev` to `dist/release` via `svn mv`, update the website, and tag `rel/<version>` in Git.
5. **Publish to PyPI**
   - **Release candidates**: Tag the version with a [PEP 440 pre-release identifier](https://peps.python.org/pep-0440/#pre-releases) (e.g., `poetry version 1.2.0rc1`) so the generated filenames already carry the `rc` suffix PyPI recognizes. Upload the artifacts as a pre-release and note the RC name in the vote thread. PyPI automatically treats `*rcN` builds as pre-releases, keeping them hidden from `pip install apache-polaris-cli` unless users opt in.
   - **Final releases**: After the vote passes, bump the version to the final tag (e.g., `poetry version 1.2.0`), rebuild from the voted source revision, and re-run the staging signature/checksum steps so the GA binaries match the source release.
   ```bash
   python -m pip install --upgrade pip twine
   twine upload dist/*
   ```
   Use the shared `apache` credentials for both RC and GA uploads, then verify the published package by downloading it into a clean virtual environment and running `polaris --help`. Reference Appendix A while validating that the GA artifact layout still matches the audited RC contents.
6. **Announce**
   - Send `[RESULT]` and `[ANNOUNCE]` mails referencing both the downloads site and PyPI convenience binary.

### 3.3 Access management
- Maintain PyPI access through the shared `apache` organization account; add at least two PMC members as project maintainers for redundancy.
- Store PyPI tokens in ASF-managed secrets backends (e.g., password.apache.org) and rotate them after each release manager handoff.
- Document procedures for recovering credentials and verifying uploads on the private PMC wiki.

## 4. Nightly TestPyPI publishing
Nightly builds provide early access to upcoming features without polluting the production PyPI namespace.

1. **Version scheme**: Emit calendar-based dev versions such as `<next-version>.dev<YYYYMMDD>` to distinguish nightlies from voted releases.
2. **Automation**: Extend CI to run on every merge to `main`:
   ```bash
   make client-setup-env
   make client-unit-test client-build
   twine upload --repository testpypi dist/*
   ```
   Use a dedicated TestPyPI token stored in ASF-managed GitHub secrets, and gate the workflow to avoid production uploads.
3. **Artifact parity**: Run the same generators and tests used for releases so nightly wheels remain reproducible from source.
4. **Consumption**: Users can test nightlies with:
   ```bash
   python -m pip install \
     --index-url https://test.pypi.org/simple/ \
     --extra-index-url https://pypi.org/simple/ \
     apache-polaris-cli==<next-version>.dev20250101
   ```
5. **Housekeeping**: Periodically prune obsolete TestPyPI versions through the web UI or API to avoid clutter.

## 5. Automation roadmap

- **Release automation**: Script the staging workflow in `tools/release/` to wrap the Makefile targets, `poetry version`, signature generation, checksum creation, and Subversion publication into a single reproducible command. Capture intermediate outputs (GPG fingerprints, SHA512 sums, Appendix A listings) to streamline vote e-mails.
- **RC to GA promotion**: Add a helper that checks out the voted Git tag, bumps the version from `rcN` to GA, rebuilds, and diffs the artifact manifests against Appendix A to confirm no layout drift before uploading to PyPI.
- **Nightly pipeline**: Extend the GitHub Actions workflow to reuse the Makefile recipes, upload to TestPyPI with project-scoped credentials, and attach the simplified pip install instructions above to the job summary so downstream testers can copy/paste them.

## 6. Open questions
- Final decision on the PyPI name and whether the import path should match it.
- Confirm the long-term Python support policy once Python 3.9 is dropped.
- Determine where CLI user documentation will live (website section vs. dedicated docs site).

## Appendix A. Distribution contents

Use the scripted listings below to verify which files land in each artifact produced by `poetry build`. The ellipses (`...`) indicate deeper subdirectories that contain the generated API modules and templates.

### Wheel (`dist/*.whl`)

```bash
python - <<'PY'
import zipfile
from pathlib import Path

wheel_path = Path('dist/polaris-1.2.0-cp311-cp311-manylinux_2_39_x86_64.whl')
with zipfile.ZipFile(wheel_path) as zf:
    files = [Path(p) for p in zf.namelist() if not p.endswith('/')]

def build_tree(paths):
    tree = {}
    for path in paths:
        parts = path.parts
        cur = tree
        for part in parts[:-1]:
            cur = cur.setdefault(part, {})
        cur.setdefault(parts[-1], None)
    return tree

def format_tree(tree, prefix="", depth=0, max_depth=3):
    lines = []
    entries = sorted(tree.items())
    total = len(entries)
    for idx, (name, subtree) in enumerate(entries):
        connector = "└── " if idx == total - 1 else "├── "
        lines.append(f"{prefix}{connector}{name}")
        if isinstance(subtree, dict):
            if depth + 1 >= max_depth:
                if subtree:
                    extension = "    " if idx == total - 1 else "│   "
                    lines.append(f"{prefix}{extension}└── ...")
            else:
                extension = "    " if idx == total - 1 else "│   "
                lines.extend(format_tree(subtree, prefix + extension, depth + 1, max_depth))
    return lines

tree = build_tree(files)
print('polaris-1.2.0-cp311-cp311-manylinux_2_39_x86_64.whl')
for line in format_tree(tree):
    print(line)
PY
```

```text
polaris-1.2.0-cp311-cp311-manylinux_2_39_x86_64.whl
├── LICENSE
├── NOTICE
├── cli
│   ├── __init__.py
│   ├── command
│   │   ├── __init__.py
│   │   ├── catalog_roles.py
│   │   ├── catalogs.py
│   │   ├── namespaces.py
│   │   ├── principal_roles.py
│   │   ├── principals.py
│   │   ├── privileges.py
│   │   └── profiles.py
│   ├── constants.py
│   ├── options
│   │   ├── __init__.py
│   │   ├── option_tree.py
│   │   └── parser.py
│   └── polaris_cli.py
├── polaris
│   ├── .keep
│   ├── __init__.py
│   ├── catalog
│   │   ├── .keep
│   │   ├── __init__.py
│   │   ├── api
│   │   │   └── ...
│   │   ├── api_client.py
│   │   ├── api_response.py
│   │   ├── configuration.py
│   │   ├── exceptions.py
│   │   ├── models
│   │   │   └── ...
│   │   └── rest.py
│   └── management
│       ├── .keep
│       ├── __init__.py
│       ├── api
│       │   └── ...
│       ├── api_client.py
│       ├── api_response.py
│       ├── configuration.py
│       ├── exceptions.py
│       ├── models
│       │   └── ...
│       └── rest.py
└── polaris-1.2.0.dist-info
    ├── METADATA
    ├── RECORD
    ├── WHEEL
    ├── entry_points.txt
    └── licenses
        ├── LICENSE
        └── NOTICE
```

### Source distribution (`dist/*.tar.gz`)

```bash
python - <<'PY'
import tarfile
from pathlib import Path

sdist_path = Path('dist/polaris-1.2.0.tar.gz')
with tarfile.open(sdist_path, 'r:gz') as tf:
    names = [Path(m.name) for m in tf.getmembers() if m.isfile()]

def build_tree(paths):
    tree = {}
    for path in paths:
        parts = path.parts
        cur = tree
        for part in parts[:-1]:
            cur = cur.setdefault(part, {})
        cur.setdefault(parts[-1], None)
    return tree

def format_tree(tree, prefix="", depth=0, max_depth=3):
    lines = []
    entries = sorted(tree.items())
    total = len(entries)
    for idx, (name, subtree) in enumerate(entries):
        connector = "└── " if idx == total - 1 else "├── "
        lines.append(f"{prefix}{connector}{name}")
        if isinstance(subtree, dict):
            if depth + 1 >= max_depth:
                if subtree:
                    extension = "    " if idx == total - 1 else "│   "
                    lines.append(f"{prefix}{extension}└── ...")
            else:
                extension = "    " if idx == total - 1 else "│   "
                lines.extend(format_tree(subtree, prefix + extension, depth + 1, max_depth))
    return lines

tree = build_tree(names)
print('polaris-1.2.0.tar.gz')
for line in format_tree(tree):
    print(line)
PY
```

```text
polaris-1.2.0.tar.gz
└── polaris-1.2.0
    ├── LICENSE
    ├── NOTICE
    ├── PKG-INFO
    ├── README.md
    ├── cli
    │   ├── __init__.py
    │   ├── command
    │   │   └── ...
    │   ├── constants.py
    │   ├── options
    │   │   └── ...
    │   └── polaris_cli.py
    ├── generate_clients.py
    ├── polaris
    │   ├── .keep
    │   ├── __init__.py
    │   ├── catalog
    │   │   └── ...
    │   └── management
    │       └── ...
    ├── pyproject.toml
    ├── spec
    │   ├── README.md
    │   ├── generated
    │   │   └── ...
    │   ├── iceberg-rest-catalog-open-api.yaml
    │   ├── polaris-catalog-apis
    │   │   └── ...
    │   ├── polaris-catalog-service.yaml
    │   └── polaris-management-service.yml
    └── templates
        ├── header-cfg.txt
        ├── header-ini.txt
        ├── header-json5.txt
        ├── header-md.txt
        ├── header-py.txt
        ├── header-sh.txt
        ├── header-toml.txt
        ├── header-txt.txt
        ├── header-typed.txt
        ├── header-xml.txt
        ├── header-yaml.txt
        └── header-yml.txt
```

---
Prepared for discussion by the Apache Polaris community.
