package JavaBasicPrograms;

import java.util.Arrays;

public class SecondMinMaxWithSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7,6,9 ,1};

        if (numbers.length < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        int secondMin = numbers[1];
        int secondMax = numbers[numbers.length - 2];

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Second Minimum: " + secondMin);
        System.out.println("Second Maximum: " + secondMax);
    }
}