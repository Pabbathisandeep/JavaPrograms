package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecificValueFromArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 7)); // Example ArrayList

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(4)) {
                list.remove(i);
                i--; // Decrement i to adjust for the removal
            }
        }

        System.out.println("Values after removing specific value: " + list);
    }
}