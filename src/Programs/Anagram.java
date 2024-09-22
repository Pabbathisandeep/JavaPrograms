package Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		anagram("Race","Care");
		anagram2("race","acre");
	}
	
	public static void anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2=  s2.toLowerCase();
		boolean anagram = false;
		if(s1.length()==s2.length()) {
			char[] cArray1 = s1.toCharArray();
			char[] cArray2 = s2.toCharArray();
			Arrays.sort(cArray1);
			Arrays.sort(cArray2);
			anagram = Arrays.equals(cArray1, cArray2);
			if(anagram) {
				System.out.println("two strings are anagrams");
			}else {
				System.out.println("two strings are not anagrams");
			}
		}
		else {
			System.out.println("two strings are not anagrams");
		}
	}
	
//	if(s1.charAt(i)==s2.charAt(j)) {
//		anagram = true;
//		break;
//	}else {
//		anagram=false;
//	}
	
	public static void anagram2(String s1, String s2) {
		boolean anagram = true;
		char[] cArray1 = s1.toCharArray();
		char[] cArray2 = s2.toCharArray();
		for(int i=0;i<s1.length();i++) 
		{
			
		}
		if(anagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
		
		
	}
	

}
