import java.util.*;
public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, key, i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        int result = lastOccurence(arr, key, n - 1);
        System.out.println("Last occurrence: " + result);
        sc.close();
    }
}