package JavaBasicPrograms;

import java.util.HashSet;
import java.util.Set;

public class Uniquecharacters {

    public static void main(String[] args) {
        String str = "Shivay Vasmavi";
        str=str.toLowerCase();
        char[] inp = str.toCharArray();
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();
        
        System.out.println("Unique Characters are:");
        for (char c : inp) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            } else {
                duplicateChars.add(c);
            }
        }
        
        for (char c : uniqueChars) {
            if (!duplicateChars.contains(c)) {
                System.out.print(c + " ");
            }
        }
    }
}

