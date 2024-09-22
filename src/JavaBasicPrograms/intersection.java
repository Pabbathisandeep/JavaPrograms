package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5,6,7,12};
		int[] arr2= {8,9,12,4,5,6,};
		
		Set<Integer> set= new HashSet<>();
		for(int i: arr1) {
			set.add(i);
			
		}
		
		List<Integer> intersection= new ArrayList<>();
		for(int i: arr2) {
			if(set.contains(i)) {;
			intersection.add(i);
		}
	}	
System.out.println("Common number in both the arrays "+intersection);
	}
}