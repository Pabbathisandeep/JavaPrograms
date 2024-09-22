package JavaBasicPrograms;

import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) {
        
    	int[] a= {1,2,3,4,5,6,7};
        int mid=a.length/2;
    	
    	int[] part1= new int[mid];
    	int[] part2= new int[a.length-mid];
    	
    System.arraycopy(a, 0, part1, 0, mid);
    System.arraycopy(a, mid, part2, 0, a.length-mid);
    
    System.out.println("part1" +Arrays.toString(part1));
    System.out.println("part2" +Arrays.toString(part2));
}

}



