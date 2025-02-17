# Policy

A policy in Apache Polaris defines a set of rules for governing access, data usage, and operational consistency across various catalog resources.  Policies are stored within Polaris and can be applied to catalogs, namespaces, tables, views, and other table-like entities. For example, they can be used for fine-grained control over who can perform specific actions on certain resources.  The policy object includes - **owner-entity:** The entity that owns the policy - **policy-type:** The type of the policy, which determines the expected format and semantics of the policy content. - **name:**  A human-readable name for the policy, which must be unique within a given namespace. - **description:** Detailed description of the purpose and functionalities of the policy. - **content:** Policy content, which can be validated against predefined schemas of a policy type. - **version:** Indicates the current version of the policy. Versions increased monotonically, the default value is 0 - **created_at:** A timestamp (in milliseconds) indicating when the policy was created. - **updated_at:** A timestamp (in milliseconds) indicating the last update time of the policy.  Policies stored in Polaris serve as the persistent definition for access control and governance rules. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner_entity** | [**EntityIdentifier**](EntityIdentifier.md) |  | 
**policy_type** | **str** |  | 
**name** | **str** | A policy name. A valid policy name should only consist of uppercase and lowercase letters (A-Z, a-z), digits (0-9), hyphens (-), underscores (_). | 
**description** | **str** |  | [optional] 
**content** | **str** |  | [optional] 
**version** | **int** |  | 
**created_at_ms** | **int** |  | [optional] 
**updated_at_ms** | **int** |  | [optional] 

## Example

```python
from polaris.catalog.models.policy import Policy

# TODO update the JSON string below
json = "{}"
# create an instance of Policy from a JSON string
policy_instance = Policy.from_json(json)
# print the JSON string representation of the object
print(Policy.to_json())

# convert the object into a dict
policy_dict = policy_instance.to_dict()
# create an instance of Policy from a dict
policy_from_dict = Policy.from_dict(policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


