## Bubble Sort

In bubble sort algorithm, array is traversed from first element to last element. Here, current element is compared with the next element. If current element is greater than the next element, it is swapped.

Unlike selection sort, instead of finding the smallest record and performing the interchange, two records are interchanged immediately upon discovering that they are out of order.

- In Pass 1, A[0] is compared with A[1], A[1] is compared with A[2], A[2] is compared with A[3] and so on. At the end of pass 1, the largest element of the list is placed at the highest index of the list.

- In Pass 2, A[0] is compared with A[1], A[1] is compared with A[2] and so on. At the end of Pass 2 the second largest element of the list is placed at the second highest index of the list.

- In pass n-1, A[0] is compared with A[1], A[1] is compared with A[2] and so on. At the end of this pass. The smallest element of the list is placed at the first index of the list.

### Algorithms

```text
1. Repeat Step 2
	for i = 0 to N-1

2. Repeat Step 3
	for j = 0 to N-i-1

3. if ( arr[j] > arr[j+1] )
	SWAP arr[j] with arr[j+1]

4. Exit
```
