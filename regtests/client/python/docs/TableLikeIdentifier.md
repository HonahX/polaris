# TableLikeIdentifier


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog** | **str** |  | 
**namespace** | **List[str]** | Reference to one or more levels of a namespace | 
**name** | **str** |  | 

## Example

```python
from polaris.catalog.models.table_like_identifier import TableLikeIdentifier

# TODO update the JSON string below
json = "{}"
# create an instance of TableLikeIdentifier from a JSON string
table_like_identifier_instance = TableLikeIdentifier.from_json(json)
# print the JSON string representation of the object
print(TableLikeIdentifier.to_json())

# convert the object into a dict
table_like_identifier_dict = table_like_identifier_instance.to_dict()
# create an instance of TableLikeIdentifier from a dict
table_like_identifier_from_dict = TableLikeIdentifier.from_dict(table_like_identifier_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


