## Merge Sort

Merge Sort is a divide and conquer algorithm

It is based on the idea of breaking down a list into several sub-lists until each sub list consists of a single element

Merging those sub lists in a manner that results into a sorted list

- Find the middle point to divide the array into two halves:  
   middle m = l+ (r-l)/2

- Call sort for first half:  
   Call sort(arr, l, m)

- Call sort for second half:
  Call sort(arr, m+1, r)

- Merge the two halves sorted in step 2 and 3:
  Call merge(arr, l, m, r)

- Repeat the process till a single sorted list of obtained

### Algorithms

**Sort**

```text
1. Repeat Steps 2 to 5
      if(beg < end)

2. SET mid = (beg + end)/2

3. CALL sort(arr, beg, mid)

4. CALL sort(arr,mid+1, end)

5. merge(arr, beg, mid, end);

6. Exit
```

**Merge**

```text
1. SET i=beg, j=mid+1, k=beg , []tempArr = new int[end+1]

2. Repeat Steps 3
      while(i<=mid && j<=end)

3. if(arr[i] < arr[j])
      SET tempArr[k] = arr[i];
      i++;
   else
      SET tempArr[k] = arr[j];
      j++;
   k++;

4. if(i > mid)
      while(j<=r)
         SET tempArr[k] = arr[j]
         k++
         j++
   else
      while (i<=mid)
         SET tempArr[k] = arr[i];
         k++;
         i++;

5. COPY tempArr IN arr

6. Exit
```
