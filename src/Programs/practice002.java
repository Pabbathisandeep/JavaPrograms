package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice002 {

	public static void main(String[] args) {
		reverseString("JavaProgramming");
		swap(2,3);
		fibonacci(5);
		armstrongnumber(153);
		sumofdigitsinnumber(1535);
		primenumber(971);
		nocharactersinstring("sandeep");
		occurranceofeachcharacter("sandeep");
		capitilizewordsInString("this is string man");
		noofcapitilizedwordsInString("sandeep Reddy Pabbathi");
		addIntegersInString("qwer 123 iopfd");
		removespaces("  sandeep reddy  ");
		RightHalfPyramid(5);
		polindrome(25649);
		multiDimensionalArray();
	}
	
	public static void reverseString(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void swap(int a, int b) {
		a= a+b;
		b= a-b;
		a = a-b;
		System.out.println();
		System.out.println(a+" "+b);
	}
	
	public static void fibonacci(int n) {
		int first = 0, second = 1, next;
		for(int i=0;i<=n;i++) {
			System.out.println(first);
			next = first+second;
			first = second;
			second = next;
		}
	}
	
	public static void armstrongnumber(int n) {
		int arm= 0, temp=0;
		temp=n;
		while(n>0) {
			int r = n%10;
			arm = (r*r*r)+arm;
			n=n/10;
		}
		if(arm==temp) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}
	
	public static void sumofdigitsinnumber(int n) {
		int sum=0;
		while(n>0) {
			int r = n%10;
			sum += r;
			n=n/10;
		}
		System.out.println(sum);
	}
	
	public static void primenumber(int n) {
		if(n==0||n==1) {
			System.out.println("not a prime number");
		}else {
			boolean isprime= true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println("Prime number");
			}else {
				System.out.println("not prime number");
			}
		}
	}
	
	public static void nocharactersinstring(String str) {
		System.out.println(str.length());
	}
	
	public static void occurranceofeachcharacter(String str) {
		char[] characters = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(char c:characters) {
			charCount.put(c, charCount.containsKey(c)? charCount.get(c)+1:1);
		}
		System.out.println(charCount);
		
		Set<Character> charInString = charCount.keySet();
		for(char c: charInString) {
			if(charCount.get(c)>1) {
				System.out.println(c+" "+charCount.get(c));
			}
		}
	}
	
	public static void capitilizewordsInString(String str) {
		String[] words = str.split(" ");
		StringBuilder capitilizedwords = new StringBuilder();
		for(String word:words) {
			if(word.length()>0) {
				capitilizedwords.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
			}
		}
		
		System.out.println(capitilizedwords);
	}
	
	public static void noofcapitilizedwordsInString(String str) {
		String[] words = str.split(" ");
	int count= 0;
		for(String word:words) {
			if(Character.isUpperCase(word.charAt(0))){
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	public static void addIntegersInString(String str) {
		str = str.replaceAll("[^0-9]", "");
		System.out.println(str);
		int result=0;
		for(int i=0;i<str.length();i++) {
			result = result+Character.getNumericValue(str.charAt(i));
		}
		System.out.println(result);
	}
	
	public static void removespaces(String str) {
		str = str.replaceAll("^\\s+", "");
		str = str.replaceAll("\\s+$", "");
		System.out.println(str);
	}
	
	public static void RightHalfPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public static void polindrome(int n) {
		int temp=n;
		int rev = 0;
		while(n>0) {
			int r = n%10;
			rev = rev*10+r;
			n = n/10;
		}
		System.out.println(rev);
	}
	
	
	public static void multiDimensionalArray() {
		int nums[][] = new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j] = (int)(Math.random()*100);
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
}
