package JavaBasicPrograms;

import java.util.Arrays;



public class RemoveFirstAndLastValuesfromArray {
    public static void main(String[] args) {
        // Sample array
        int[] array = {5,1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Check if the array has at least two elements
        if (array.length < 2) {
            System.out.println("Array should have at least two elements");
        } else {
            // Remove first and last elements
            int[] newArray = new int[array.length - 2];
            
            // Copy elements excluding the first and last
            System.arraycopy(array, 1, newArray, 0, array.length - 2);

            // Print the modified array
            System.out.println("Array after removing first and last elements: " + Arrays.toString(newArray));
        }
    }
}
