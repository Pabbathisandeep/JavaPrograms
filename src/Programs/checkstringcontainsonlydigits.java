package Programs;

public class checkstringcontainsonlydigits {

	public static void main(String[] args) {
		stringcontainsdigits("66265558");
		StringContainsDigits("4444997515");
	}
	
	public static void stringcontainsdigits(String str) {
		boolean flag = false;
		char[] cArray = str.toCharArray();
		for(char c:cArray) {
		flag = Character.isDigit(c);
		}
		if(flag) {
			System.out.println("String contains only digits");
		}else {
			System.out.println("string not contains digits");
		}
	}
	
	public static void StringContainsDigits(String str) {
		boolean flag = false;
		char[] cArray = str.toCharArray();
		for(char c: cArray) {
			if(c>'0' && c<'9') {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("String contains only digits");
		}else {
			System.out.println("string not contains digits");
		}
	}

}
