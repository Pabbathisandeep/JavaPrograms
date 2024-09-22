package JavaBasicPrograms;
import java.util.Arrays;

public class RotateArrayLeftWithoutMethod {
    public static void main(String[] args) {
    	
    	int[] array= {1,2,3,4,5,6,7};   //3,4,5,6,1,2
    	int rotationcount=2;
    	
    	System.out.println("Before rotation : " +Arrays.toString(array));
    	
    	for(int i=0;i<rotationcount;i++) {
    		int firstElement= array[0];
    		
    		for(int j=0;j<array.length-1;j++) {
    			
    			array[j]=array[j+1];
    			
    			
    		}array[array.length-1]=firstElement;
        }
    	System.out.println("After rotation : " +Arrays.toString(array));
    
    	}
    	
}
