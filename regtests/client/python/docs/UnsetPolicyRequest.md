# UnsetPolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**EntityIdentifier**](EntityIdentifier.md) |  | 

## Example

```python
from polaris.catalog.models.unset_policy_request import UnsetPolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UnsetPolicyRequest from a JSON string
unset_policy_request_instance = UnsetPolicyRequest.from_json(json)
# print the JSON string representation of the object
print(UnsetPolicyRequest.to_json())

# convert the object into a dict
unset_policy_request_dict = unset_policy_request_instance.to_dict()
# create an instance of UnsetPolicyRequest from a dict
unset_policy_request_from_dict = UnsetPolicyRequest.from_dict(unset_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


