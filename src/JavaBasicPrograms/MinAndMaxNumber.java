package JavaBasicPrograms;

import java.util.Arrays;

public class MinAndMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {8,2,5,9,3,52,15,11,6};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				System.out.println("Latest minium number is : " +min);
				
				
			}
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		
		//Arrays.sort(arr);
		
System.out.println("The minimium number in given array is  " +min );
System.out.println("The maximum number in given array is  " +max );
	}

}
