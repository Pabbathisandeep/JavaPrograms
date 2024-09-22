package Programs;

import java.util.Arrays;

public class sortStringArray {

	public static void main(String[] args) {
		String[] strArr = {"sandeep", "reddy", "pabbathi", "sandeep", "reddy"};
		for(int i=0;i<strArr.length-1;i++) {
			for(int j=i+1;j<strArr.length;j++) {
				if(strArr[i].compareToIgnoreCase(strArr[j])> 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(strArr));
		

	}

}
