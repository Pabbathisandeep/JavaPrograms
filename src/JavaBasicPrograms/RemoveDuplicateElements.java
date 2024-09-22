package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list= new ArrayList<>(Arrays.asList("java","oracle","sql","java","sql","test"));
		//ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
       
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println("values after removing duplicates are " +list);
	}

}
