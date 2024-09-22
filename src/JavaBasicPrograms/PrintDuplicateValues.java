package JavaBasicPrograms;

import java.util.ArrayList;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {2,5,2,8,9,1,5,4,6,1,9,0,6,4,0};
		String[] arr= {"test","value","verify","validate","test","validate","done","done"};
		
		//ArrayList<Integer> duplicates= new ArrayList<>();
		ArrayList<String> duplicates= new ArrayList<>();
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && !duplicates.contains(arr[i])) {
				duplicates.add(arr[i]);
				}
			}
		}
		
System.out.println("duplicate values in the array are " +duplicates);
	}

}
