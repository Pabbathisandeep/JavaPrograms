package Programs;

public class occuranceofGivenCharacterInString {

	public static void main(String[] args) {
		
		givencharacteroccurance("sandeeep", 'e');
	}
	
	public static void givencharacteroccurance(String str, char ch) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
