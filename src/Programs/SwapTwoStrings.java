package Programs;

public class SwapTwoStrings {

	public static void main(String[] args) {
		swapStrings("Sandeep", "reddy");

	}
	
	public static void swapStrings(String s1, String s2) {
		String temp="";
		temp = s1;
		s1=s2;
		s2=temp;
		System.out.print(s1+" "+s2);
	
	}

}
