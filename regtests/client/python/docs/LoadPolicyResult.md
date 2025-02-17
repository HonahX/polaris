# LoadPolicyResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | [**Policy**](Policy.md) |  | [optional] 

## Example

```python
from polaris.catalog.models.load_policy_result import LoadPolicyResult

# TODO update the JSON string below
json = "{}"
# create an instance of LoadPolicyResult from a JSON string
load_policy_result_instance = LoadPolicyResult.from_json(json)
# print the JSON string representation of the object
print(LoadPolicyResult.to_json())

# convert the object into a dict
load_policy_result_dict = load_policy_result_instance.to_dict()
# create an instance of LoadPolicyResult from a dict
load_policy_result_from_dict = LoadPolicyResult.from_dict(load_policy_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


