# CreatePolicyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | A policy name. A valid policy name should only consist of uppercase and lowercase letters (A-Z, a-z), digits (0-9), hyphens (-), underscores (_). | 
**type** | **str** |  | 
**description** | **str** |  | [optional] 
**content** | **str** |  | [optional] 

## Example

```python
from polaris.catalog.models.create_policy_request import CreatePolicyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePolicyRequest from a JSON string
create_policy_request_instance = CreatePolicyRequest.from_json(json)
# print the JSON string representation of the object
print(CreatePolicyRequest.to_json())

# convert the object into a dict
create_policy_request_dict = create_policy_request_instance.to_dict()
# create an instance of CreatePolicyRequest from a dict
create_policy_request_from_dict = CreatePolicyRequest.from_dict(create_policy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


