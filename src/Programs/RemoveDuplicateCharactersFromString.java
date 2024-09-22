package Programs;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		removeDuplicates("sandeepreddy");

	}
	
	public static void removeDuplicates(String str) {
		boolean isDuplicate = false;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					isDuplicate = true;
					break;
				}else {
					isDuplicate = false;
				}
			}
			if(isDuplicate == false) {
				System.out.print(str.charAt(i));
			}
			
		}
	
	}
}
