package JavaBasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		
		String[] str= {"java","selenium","oracle","testng","java","sql","oracle","selenium","sql"};
		
		Set<String> uniqueValues= new HashSet<>();
		Set<String> duplicateValues= new HashSet<>();
		
		System.out.print("duplicate words are ");
		for(String words:str ) {
			if(!uniqueValues.add(words)) {
				duplicateValues.add(words);
			}
		}
		System.out.println(" ");
		for(String word :duplicateValues) {
			System.out.println(word);
		}
		
		
}
}