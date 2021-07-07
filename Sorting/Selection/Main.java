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

        selectionSort(arr, n);

        System.out.print("\nAfter Sort : ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }

    // Logic for Selection sort algorithm
    public static void selectionSort(int []arr, int n)
    {
        int temp,min_inx;

        for(int i=0; i < n-1; i++)
        {
            min_inx = i;

            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[min_inx])
                {
                    min_inx = j;
                }
            }

            if(min_inx != i){
                temp = arr[i];
                arr[i] = arr[min_inx];
                arr[min_inx] = temp;
            }
        }
    }
}