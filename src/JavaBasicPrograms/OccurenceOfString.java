package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {
		
		//String str="12312312311";
		String str="testautomatioaneea";
		
		
		Map<Character,Integer> charFrequency= new HashMap<>();
		
		for(char word:str.toCharArray()) {
			if(charFrequency.containsKey(word)) {
				charFrequency.put(word, charFrequency.get(word) + 1);
				
				
			}else {
				
				charFrequency.put(word, 1);
			}
		}
		
     for(Character sh:charFrequency.keySet()) {
    	 int count=charFrequency.get(sh);
    	 System.out.println(sh + " occurs " +count + " times");
     }
	}

}
