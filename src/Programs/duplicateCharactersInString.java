package Programs;

import java.util.HashMap;
import java.util.Set;

public class duplicateCharactersInString {

	public static void main(String[] args) {
		String str = "sandeep reddy";
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] cArray = str.toCharArray();
		for(char c:cArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
		
		Set<Character> charInString = charMap.keySet();
		for(char ch: charInString) {
			if(charMap.get(ch)>1) {
				System.out.println(ch+": "+charMap.get(ch));
			}
			
		}
		

	}
	
	

}
