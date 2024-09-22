package Programs;

import java.util.HashMap;
import java.util.Map;

public class test1 {

	public static void main(String[] args) {
		String s1 = "visabcd";
		String s2 = "danvisacd";
		String s3 = "dasrefrvisaabcdedf";

		String longestCommonsubstring = "";
		int maxLength = 0;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				String subStr = s1.substring(i,j);
				if(s2.contains(subStr)&&s3.contains(subStr)&& subStr.length() > maxLength) {
					longestCommonsubstring = subStr;
					maxLength = subStr.length();
				}
			}
		}
		System.out.println(longestCommonsubstring);
		
		String str = "abd2dfed4e5sf";
		String temp = "";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(sum);
	}

}
