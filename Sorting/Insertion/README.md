## Insertion Sort

In insertion sort, every iteration moves an element from unsorted portion to sorted portion until all the elements are sorted in the list.

- Assume that first element in the list is in sorted portion of the list and remaining all elements are in unsorted portion.

- Select first element from the unsorted list and insert that element into the sorted list in order specified.

- Repeat the above process until all the elements from the unsorted list are moved into the sorted list.

### Algorithms

```text
1. Repeat Steps 2 to 7
	for k = 1 to N-1

2. SET temp = arr[k]

3. SET j = k-1

4. Repeat 5 and 6
	while( j>=0 && temp <= arr[j])

5. SET arr[j+1] = arr[j]

6. SET j = j-1

7. SET arr[j+1] = temp

8. Exit
```
