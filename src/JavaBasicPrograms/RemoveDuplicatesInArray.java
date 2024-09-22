package JavaBasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,5,2,8,9,1,5,4,6,1,9,0,6};
		
		Set<Integer> set= new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
		}
		System.out.println(" the duplicate values are "+set);

	}

}
