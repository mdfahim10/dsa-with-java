import java.util.*;

public class FrequencyOfElement {

    public static int countFreq(int arr[], int element) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to get Frequency: ");
        int element = sc.nextInt();

        System.out.println("\n===== Original Array =====");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");
        }

        System.out.println();

        int frequency = countFreq(arr, element);

        if (frequency == 0) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Frequency of " + element + " = " + frequency);
        }

        sc.close();
    }
}