# StorageCredential


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prefix** | **str** | Indicates a storage location prefix where the credential is relevant. Clients should choose the most specific prefix (by selecting the longest prefix) if several credentials of the same type are available. | 
**config** | **Dict[str, str]** |  | 

## Example

```python
from polaris.catalog.models.storage_credential import StorageCredential

# TODO update the JSON string below
json = "{}"
# create an instance of StorageCredential from a JSON string
storage_credential_instance = StorageCredential.from_json(json)
# print the JSON string representation of the object
print(StorageCredential.to_json())

# convert the object into a dict
storage_credential_dict = storage_credential_instance.to_dict()
# create an instance of StorageCredential from a dict
storage_credential_from_dict = StorageCredential.from_dict(storage_credential_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


