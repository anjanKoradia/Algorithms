import java.util.*;

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

        QuickSort qs = new QuickSort();
        qs.sort(arr,0,n-1);

        System.out.print("\nAfter Sort : ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}

class QuickSort{
    void sort(int []arr, int low, int high)
    {
        if(low < high){
            int pivot = partition(arr,low,high);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
        }
    }

    int partition(int []arr, int low, int high)
    {

        int pivot = arr[low], i = low, j = high;

        while (i < j){
            while (arr[i] <= pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }

            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    void swap(int []arr, int val1, int val2)
    {
        int temp;
        temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}