package JavaBasicPrograms;

import java.util.Arrays;

public class ShiftZerosRight {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
         Arrays.sort(nums);
         System.out.println("After sorted :" +Arrays.toString(nums));
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Shifting zeros to the right
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex--;
            }
        }

        System.out.println("\nArray after shifting zeros to the right:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

