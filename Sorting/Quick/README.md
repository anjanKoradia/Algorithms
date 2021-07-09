## Quick Sort

Quick Sort is divide and conquer algorithm.

Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.

At each step of the method, the goal is to place a particular record in its final position within the table, this particular records is termed pivot element.

There are many different versions of Quick Sort that pick pivot in different ways.

- Always pick first element as pivot.
- Always pick last element as pivot.
- Pick a random element as pivot.
- Pick median as pivot. (in our case we have consider this version)

Quick sort partitions an array and then calls itself recursively twice to sort the two resulting sub arrays.

### Algorithms

**Sort**

```text
1. Repeat Steps 2 to 4
      if(low < high)

2. SET pivot = partition(arr,low,high)

3. CALL sort(arr, low, pivot-1)

4. CALL sort(arr, pivot+1, high)

5. Exit
```

**Partition**

```text
1. SET pivot = arr[low], i = low, j = high

2. Repeat Steps 3 to 5
      while(i<j)

3. while(arr[i] <= pivot)
      i++;

4. while (arr[j] > pivot)
      j--;

5. if (i < j)
      swap(arr, i, j)

6. swap(arr, low, j)
      return j

7. Exit
```
