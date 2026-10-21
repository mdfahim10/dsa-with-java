import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int uniqueIndex = 0;
        int uniqueCount = 1;
        int currentIndex = 1;

        while (currentIndex < nums.length) {

            if (nums[currentIndex] == nums[currentIndex - 1]) {
                currentIndex++;
                continue;
            }

            nums[uniqueIndex + 1] = nums[currentIndex];

            uniqueIndex++;
            uniqueCount++;
            currentIndex++;
        }

        return uniqueCount;
    }

    public static void main(String[] args) {

        int[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int uniqueCount = removeDuplicates(numbers);

        System.out.println("Number of Unique Elements: " + uniqueCount);

        System.out.print("Array After Removing Duplicates: ");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}