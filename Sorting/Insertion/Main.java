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

        insertionSort(arr, n);

        System.out.print("\nAfter Sort : ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }

    // Logic for Selection sort algorithm
    public static void insertionSort(int []arr, int n)
    {
        int temp, j;

        for(int i=1; i < n; i++)
        {
            temp = arr[i];
            j = i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}