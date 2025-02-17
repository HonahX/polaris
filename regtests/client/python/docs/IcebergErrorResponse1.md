# IcebergErrorResponse1

JSON wrapper for all error responses (non-2xx)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**ErrorModel**](ErrorModel.md) |  | 

## Example

```python
from polaris.catalog.models.iceberg_error_response1 import IcebergErrorResponse1

# TODO update the JSON string below
json = "{}"
# create an instance of IcebergErrorResponse1 from a JSON string
iceberg_error_response1_instance = IcebergErrorResponse1.from_json(json)
# print the JSON string representation of the object
print(IcebergErrorResponse1.to_json())

# convert the object into a dict
iceberg_error_response1_dict = iceberg_error_response1_instance.to_dict()
# create an instance of IcebergErrorResponse1 from a dict
iceberg_error_response1_from_dict = IcebergErrorResponse1.from_dict(iceberg_error_response1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


