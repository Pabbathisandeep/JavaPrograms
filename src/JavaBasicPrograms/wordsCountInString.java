package JavaBasicPrograms;
import java.util.HashMap;
import java.util.Map;

public class wordsCountInString {
    public static void main(String[] args) {
        String str="Test Automation Suite Test suite";
        
        String[] words=str.split(" ");
        
        Map<String,Integer> test= new HashMap<>();
        
        for(String word: words) {
        	test.put(word, test.getOrDefault(word,0)+1);  
        	
        	
        }
        
        for(String state: test.keySet()) {
        	int count=test.get(state);
        		System.out.println(state + ": "+count);
        	}
        }
        
        
    }

