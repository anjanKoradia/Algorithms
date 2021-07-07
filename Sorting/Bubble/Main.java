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

        bubbleSort(arr, n);

        System.out.print("\nAfter Sort : ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }

// Logic for bubble sort algorithm
    public static void bubbleSort(int []arr, int n)
    {
        int temp;

        for(int i=0; i < n; i++)
        {
            for(int j=0; j < (n-i-1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}