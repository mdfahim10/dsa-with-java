import java.util.*;

public class MaximumSubArraySum_Prefix {

    public static void maximumSubArraySum(int arr[]) {

        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            int start = i;

            for (int j = i; j < n; j++) {
                int end = j;
                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                if (max < currSum) {
                    max = currSum;
                }

            }

        }
        System.out.println("Maximum Subarray Sum : " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements :  ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements :    ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maximumSubArraySum(arr);
        sc.close();
    }
}