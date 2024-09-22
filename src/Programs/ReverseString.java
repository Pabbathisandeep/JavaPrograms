package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		reverseString("Sandeep");
		StringReverseUsingStringBuilder("reddy");
		StringReverseUsingCollections("pabbathi");
	}

	public static void reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print(reverse);
		System.out.println();
	}

	public static void StringReverseUsingStringBuilder(String str) {

		StringBuilder sb = new StringBuilder(str);
		System.out.print(sb.reverse());
		System.out.println();
	}

	public static void StringReverseUsingCollections(String str) {
		ArrayList<Character> charList = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			charList.add(c);
		}
		Collections.reverse(charList);
		charList.forEach(System.out::print);
		
	}

}
