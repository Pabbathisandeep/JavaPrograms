package JavaBasicPrograms;

public class ReverseStringWithoutMethod {
    public static void main(String[] args) {
        String original = "Hello World";
        String[] div=original.split(" ");
        String reverse=" ";
        
        for(int i=0;i<div.length;i++) {
        	String word=div[i];
        	System.out.println(word);
        	String reverseword=" ";
        	
        	for(int j=word.length()-1;j>=0;j--) {
        		reverseword=reverseword+word.charAt(j);
        		
        	}
        	reverse=reverse+reverseword+ " ";
        	
        }
        System.out.println("Original String " +original);
        System.out.println("Reversed String " +reverse);
}
}