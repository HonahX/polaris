# RemovePartitionSpecsUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] 
**spec_ids** | **List[int]** |  | 

## Example

```python
from polaris.catalog.models.remove_partition_specs_update import RemovePartitionSpecsUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of RemovePartitionSpecsUpdate from a JSON string
remove_partition_specs_update_instance = RemovePartitionSpecsUpdate.from_json(json)
# print the JSON string representation of the object
print(RemovePartitionSpecsUpdate.to_json())

# convert the object into a dict
remove_partition_specs_update_dict = remove_partition_specs_update_instance.to_dict()
# create an instance of RemovePartitionSpecsUpdate from a dict
remove_partition_specs_update_from_dict = RemovePartitionSpecsUpdate.from_dict(remove_partition_specs_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


