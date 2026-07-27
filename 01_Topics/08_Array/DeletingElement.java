import java.util.*;

public class DeletingElement {

    public static void delete(int arr[], int index) {
        int n = arr.length;
        if (index < 0 || index >= n) {
            System.out.println("Invalid Index!");
            return;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }


        System.out.println("\n======== Updated Array ========");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Index to Delete : ");
        int index = sc.nextInt();

        System.out.println("\n======== Original Array ========");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println();

        delete(arr, index);

        sc.close();
    }
}