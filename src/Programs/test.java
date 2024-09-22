package Programs;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		String str = "sandeep";
		char[] strArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(char c: strArray) {
			charCount.put(c, charCount.containsKey(c)? charCount.get(c)+1:1);
		}
		System.out.println(charCount);
			
	}

}
