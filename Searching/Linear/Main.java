import java.util.*;

public class Main
{
    public static void main(String[ ] args) {
        int n,key,flag=-1;
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

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == key)
            {
                System.out.printf("%d is present at location %d.\n", key, i + 1);
                flag = 1;
                break;
            }
        }
        if (flag == -1)
        {
            System.out.printf("%d isn't present in the array.", key);
        }
    }
}