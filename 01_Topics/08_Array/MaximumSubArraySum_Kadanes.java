import java.util.*;

public class MaximumSubArraySum_Kadanes {

    public static void maximumSubArraySum(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum : " + maxSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maximumSubArraySum(arr);

        sc.close();
    }
}