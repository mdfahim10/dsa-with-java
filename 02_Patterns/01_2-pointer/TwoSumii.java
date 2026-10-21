import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // Return 1-based indices as required by LeetCode 167
                return new int[]{left + 1, right + 1};
            }
            else if (currentSum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}