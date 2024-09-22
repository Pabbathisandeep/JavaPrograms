package JavaBasicPrograms;

public class SecondmMINMax {
    public static void main(String[] args) {
        int[] array = {7, 2, 9, 1, 5, 3, 8, 6, 4}; // Example array

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }

            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second smallest number: " + secondSmallest);
        System.out.println("Second highest number: " + secondLargest);
    }
}
