import java.util.*;

public class Main
{
    public static void main(String[ ] args) {
        int n,key;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        n = sc.nextInt();

        int []arr = new int[n];
        System.out.printf("Enter %d integers : ", n);
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to search : ");
        key = sc.nextInt();

        BinarySearch bs = new BinarySearch();
        int ans = bs.search(arr,n,key);

        System.out.printf("%d is present at location %d.\n", key, ans + 1);
    }
}

class BinarySearch
{
    int search(int []arr, int n, int key){
        int low = 0, high = arr[n - 1];

        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
            {
                return mid;
            }
            else if (key > arr[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}