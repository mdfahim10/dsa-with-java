import java.util.*;

public class Smallest_Element {
    public static int smallest_element(int numbers[], int n) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements :");
        int n = sc.nextInt();

        System.out.print("Enter array elements :    ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = smallest_element(arr, n);
        System.out.println("Smallest number is :    "+result);
    }
}
