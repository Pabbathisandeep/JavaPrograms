package Programs;

import java.util.HashMap;
import java.util.Map;

public class firstnonrepeatingcharaactersinstring {

	public static void main(String[] args) {
		firstNonRepeatingCharactersInString("sandeep");

	}

	public static void firstNonRepeatingCharactersInString(String str) {
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for(char c: str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
		}
		System.out.println(charCountMap);
		
		for(char ch:str.toCharArray()) {
			if(charCountMap.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}
	}
}
