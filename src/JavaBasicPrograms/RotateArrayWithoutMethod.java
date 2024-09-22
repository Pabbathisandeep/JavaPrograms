
package JavaBasicPrograms;

import java.util.Arrays;

public class RotateArrayWithoutMethod {
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6,7};
        int rotatoncount=2;
        
        System.out.println("Original Array : "+Arrays.toString(array));
        
        for(int i=0;i<rotatoncount;i++) {
        	int lastElement=array[array.length-1];
        	for(int j=array.length-1;j>0;j--) {
        		array[j]=array[j-1];
        		
        	}
        	array[0]=lastElement;
        }

        System.out.println("Ater  Array : "+Arrays.toString(array));
}
    
}
