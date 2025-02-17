# LoadCredentialsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storage_credentials** | [**List[StorageCredential]**](StorageCredential.md) |  | 

## Example

```python
from polaris.catalog.models.load_credentials_response import LoadCredentialsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of LoadCredentialsResponse from a JSON string
load_credentials_response_instance = LoadCredentialsResponse.from_json(json)
# print the JSON string representation of the object
print(LoadCredentialsResponse.to_json())

# convert the object into a dict
load_credentials_response_dict = load_credentials_response_instance.to_dict()
# create an instance of LoadCredentialsResponse from a dict
load_credentials_response_from_dict = LoadCredentialsResponse.from_dict(load_credentials_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


