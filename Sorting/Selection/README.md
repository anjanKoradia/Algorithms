## Selection Sort

In selection sort, the smallest value among the unsorted elements of the array is selected in every pass and inserted to its appropriate position into the array.

First, find the smallest element of the array and place it on the first position. Then, find the second smallest element of the array and place it on the second position. The process continues until we get the sorted array.

- In 1st pass, smallest element of the array is to be found along with its index pos. then, swap A[0] and A[pos]. Thus A[0] is sorted, we now have n -1 elements which are to be sorted.

- In 2nd pas, position pos of the smallest element present in the sub-array A[n-1] is found. Then, swap, A[1] and A[pos]. Thus A[0] and A[1] are sorted, we now left with n-2 unsorted elements.

- In n-1th pass, position pos of the smaller element between A[n-1] and A[n-2] is to be found. Then, swap, A[pos] and A[n-1].

### Algorithms

```text
1. Repeat Steps 2 to 4
	for i = 0 to N-1

2. SET min_inx = i

3. Repeat Steps 3 to 5
	for J = i+1 to N

4. if ( arr[j] < arr[min_inx] )
	Set min_inx = j

5. if ( min_inx != i )
	SWAP arr[i] with arr[POS]

6. Exit
```
