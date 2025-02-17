# SetPolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**EntityIdentifier**](EntityIdentifier.md) |  | 
**parameters** | **Dict[str, str]** |  | [optional] 

## Example

```python
from polaris.catalog.models.set_policy_request import SetPolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetPolicyRequest from a JSON string
set_policy_request_instance = SetPolicyRequest.from_json(json)
# print the JSON string representation of the object
print(SetPolicyRequest.to_json())

# convert the object into a dict
set_policy_request_dict = set_policy_request_instance.to_dict()
# create an instance of SetPolicyRequest from a dict
set_policy_request_from_dict = SetPolicyRequest.from_dict(set_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


