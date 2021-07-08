import java.util.Scanner;

public class Main
{
    public static void main(String[ ] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        n = sc.nextInt();

        int []arr = new int[n];
        System.out.printf("Enter %d integers : ", n);
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sort : ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }

        MergeSort mg = new MergeSort();
        mg.sort(arr,0,n-1);

        System.out.print("\nAfter Sort : ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}

// Logic for Merge sort algorithm
class MergeSort{

    void sort(int []arr, int beg, int end)
    {
        int mid;

        if(beg < end){
            // Find the middle point
            mid = (beg + end)/2;

            // Sort first and second halves
            sort(arr, beg, mid);
            sort(arr,mid+1, end);

            // Merge the sorted halves
            merge(arr, beg, mid, end);
        }
    }

    void merge(int []arr, int beg, int mid, int end)
    {
        int i=beg, j=mid+1, k=beg;
        int []tempArr = new int[end+1];


        while (i<=mid && j<=end){
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i];
                i++;
            }else{
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i > mid){
            while(j<=end){
                tempArr[k] = arr[j];
                k++;
                j++;
            }
        }else{
            while (i<=mid){
                tempArr[k] = arr[i];
                k++;
                i++;
            }
        }

        for (int m = beg; m <= end; m++) {
            arr[m] = tempArr[m];
        }
    }
}