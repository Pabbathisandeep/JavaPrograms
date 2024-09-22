package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class TotalWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Test Automation tes selenium";
		
		Map<String,Integer> countMap= new HashMap<>();
		
		String[] words=str.split(" ");
	
		for(String word : words) {
			countMap.put(word, countMap.getOrDefault(word, 0)+1);
		}
		
		int count=0;
		
		for(int total : countMap.values()) {
			count=count+total;
			
		}
		
		System.out.println(" total words are  : " + count);
}
	
}