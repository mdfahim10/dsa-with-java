
import java.util.Arrays;

public class SortedSquared {

    public int[] sortedSquares(int[] nums) {

        int negativeCount = 0;

        for (int num : nums) {
            if (num < 0) {
                negativeCount++;
            }
        }

        int positiveCount = nums.length - negativeCount;

        int[] negativeSquares = new int[negativeCount];
        int[] positiveSquares = new int[positiveCount];

        for (int i = 0; i < negativeCount; i++) {
            negativeSquares[negativeCount - 1 - i] = nums[i] * nums[i];
        }

        for (int i = negativeCount; i < nums.length; i++) {
            positiveSquares[i - negativeCount] = nums[i] * nums[i];
        }

        int[] result = new int[nums.length];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < negativeCount && j < positiveCount) {

            if (negativeSquares[i] <= positiveSquares[j]) {
                result[index] = negativeSquares[i];
                i++;
            } else {
                result[index] = positiveSquares[j];
                j++;
            }

            index++;
        }

        while (i < negativeCount) {
            result[index] = negativeSquares[i];
            i++;
            index++;
        }

        while (j < positiveCount) {
            result[index] = positiveSquares[j];
            j++;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        SortedSquared solution = new SortedSquared();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = solution.sortedSquares(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Sorted Squares: " + Arrays.toString(result));
    }
}
