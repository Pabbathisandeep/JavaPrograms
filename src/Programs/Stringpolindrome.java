package Programs;

public class Stringpolindrome {

	public static void main(String[] args) {
		PolinromeCheck("sandnas");

	}
	
	public static void PolinromeCheck(String str) {
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
		if(reverse.equals(str)) {
			System.out.println("gievn string is polindrome");
		}else {
			System.out.println("given string is not polindrome");
		}
	}

}
