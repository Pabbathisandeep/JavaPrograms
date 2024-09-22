package Programs;

import java.util.HashMap;
import java.util.Set;

public class DupicateWordsInString {

	public static void main(String[] args) {
		String str = "sandeep reddy sandeep reddy pabbathi";
		String[] wordArray = str.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word: wordArray) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			}
			else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		System.out.println(wordCount);
		Set<String> wordsInString = wordCount.keySet();
		for(String word:wordsInString) {
			if(wordCount.get(word)>1)
			System.out.println(word+": "+wordCount.get(word));
		}
		

	}

}
