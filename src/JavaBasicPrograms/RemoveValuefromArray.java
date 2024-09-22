package JavaBasicPrograms;

import java.util.Arrays;

public class RemoveValuefromArray {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Value to be removed
        int valueToRemove = 3;

        // Check if the value exists in the array
        boolean found = false;
        int newSize = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToRemove) {
                found = true;
                newSize--; // Reduce the size of the new array
            }
        }

        if (found) {
            // Create a new array without the specified value
            int[] newArray = new int[newSize];
            int newIndex = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != valueToRemove) {
                    newArray[newIndex++] = array[i];
                }
            }

            // Print the modified array
            System.out.println("Array after removing " + valueToRemove + ": " + Arrays.toString(newArray));
        } else {
            System.out.println("Value " + valueToRemove + " not found in the array.");
        }
    }
}

