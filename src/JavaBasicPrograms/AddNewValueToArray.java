package JavaBasicPrograms;

import java.util.Arrays;

public class AddNewValueToArray {
    public static void main(String[] args) {
    	 // Sample array
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Value to be added
        int valueToAdd = 10;

        // Create a new array with a larger size
        int[] newArray = new int[array.length + 1];

        // Copy existing elements into the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // Append the new value
        newArray[array.length] = valueToAdd;

        // Print the modified array
        System.out.println("Array after adding " + valueToAdd + ": " + Arrays.toString(newArray));
    }

}