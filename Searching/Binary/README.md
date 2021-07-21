## Bubble Sort

If we have an array that is sorted, we can use a much more efficient algorithm called a Binary Search.

In binary search each time we divide array into two equal half and compare middle element with search element.

Searching Logic:

- If middle element is equal to search element then we got that element and return that index
- if middle element is less than search element we look right part of array
- if middle element is greater than search element we look left part of array.

### Algorithms

```text
1.	Set POS = -1, Low = 0, High = A[n-1]

2.	Repeat steps 3,4,5
	(while Low <= High)

3.	Set Mid = (low + high)/2

4.	If (A[Mid] = Value)
	Then
		POS = Mid
		Write POS
	GOTO step 6

5.	If (Value < A[Mid])
   	Then
		High = Mid – 1
   	Else
		Low = Mid + 1

6.	If (POS = -1)
   Then
		Write “Value is not present in Array”

7.	Exit.

```
