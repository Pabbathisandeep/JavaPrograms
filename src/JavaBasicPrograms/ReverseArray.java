package JavaBasicPrograms;

import java.util.Arrays;

// Driver Code
public class ReverseArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5};
        
       for(int i=0;i<array.length/2;i++) {
    	   int j =array[i];
    	   array [i]=array[array.length-1-i];
    	   array[array.length-1-i]=j;
    	   
    	   
       }

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(array));
    }
}
