package Programs;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		characterOccurance("hyderabad");

	}
	
	public static void characterOccurance(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(char c: charArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
	}

}
