package Programs;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class AllPrograms {

	public static void main(String[] args) {
		getDate();
		DuplicateCharactersInString("royalchallengers");
		DuplicateCharactersWithitsCount("royalchallengers");
		fibonacci(5);
		primeNumber(23);
		polindrome(141);
		stringPolindrome("sanas");
		String[] strArray = { "JAVA", "PYTHON", ".NET", "JAVA" };
		removeDuplicaresInStringArray(strArray);
		StringModifications("sandeep!@#4846?><_");
		removingNumberWithoutUsingreplaceAllMethod("sandeep12343");
		printSubStringWithoutUsingSubStringMethod("Royalchallengers bangolore");
		Integer[] arr = { 10, 5, 8, 6, 78, 62, 3, 0 };
		reverseArray(arr);
		NoOfWordsInString("sandeep reddy pabbathi");
		ArraySort(arr);
		armstrongNumber(153);
		RemoveWhiteSpacesWithoutUsingReplaceMethod("s a n d e e p");
		factorial(5);
		reverseEachWordInString("sandeep  reddy pabbathi");
		ASCIIValueofAlphabet('A');
		convertStringtoInteger("12345");
		convertIntegertostring(12345);
		charactertointeger('9');

	}

	public static void getDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS z");
		String strDate = formatter.format(date);
		System.out.println(strDate);

		formatter.setTimeZone(TimeZone.getTimeZone("Europe"));
		System.out.println(formatter.format(date));
	}

	public static void DuplicateCharactersInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char currentCharacter = str.charAt(i);
			if (currentCharacter == ' ') {
				continue;
			}
			boolean isDuplicate = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == currentCharacter) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				System.out.print(currentCharacter + " ");

			}
		}
	}

	public static void DuplicateCharactersWithitsCount(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
		Set<Character> charInString = charCount.keySet();
		for (char c : charInString) {
			if (charCount.get(c) > 1) {
				System.out.println(c + " =" + charCount.get(c));
			}
		}

	}

	public static void fibonacci(int n) {
		int first = 0, second = 1, next;
		for (int i = 0; i <= n; i++) {
			System.out.print(first + " ");
			next = first + second;
			first = second;
			second = next;

		}
	}

	public static void primeNumber(int n) {
		boolean flag = true;
		if (n > 1) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("Prime Number");
			} else {
				System.out.println("not prime number");
			}
		} else {
			System.out.println("Lowest prime is 2");
		}
	}

	public static void polindrome(int n) {
		int rev = 0, temp;
		temp = n;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Polindrome");
		} else {
			System.out.println("not Polindrome");
		}
	}

	public static void stringPolindrome(String str) {
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (str.equalsIgnoreCase(revstr)) {
			System.out.println("Polindrome");
		} else {
			System.out.println("Not polindrome");
		}
	}

	public static void removeDuplicaresInStringArray(String[] strArray) {

		ArrayList<String> List = new ArrayList<String>(Arrays.asList(strArray));
		ArrayList<String> newList = new ArrayList<String>();
		for (String str : List) {
			if (!newList.contains(str)) {
				newList.add(str);
			}
		}
		System.out.println(newList);
	}

	public static void StringModifications(String str) {
		System.out.println("String after removing numbers = " + str.replaceAll("[0-9]", ""));
		System.out.println("String after removing special characters = " + str.replaceAll("[^a-z0-9\\s]", "")); // \\s
																												// -->
																												// whitespaces
																												// // ^
																												// --->
																												// neagtes
	}

	public static void removingNumberWithoutUsingreplaceAllMethod(String str) {
		char[] charArray = str.toCharArray();
		String newString = "";
		for (char c : charArray) {
			if (!Character.isDigit(c)) {
				newString = newString + c;
			}
		}
		System.out.println(newString);
	}

	public static void printSubStringWithoutUsingSubStringMethod(String str) {
		String newStr = "";
		int startsFrom = 5, endsBefore = 17;
		for (int i = startsFrom; i < endsBefore; i++) {
			newStr += String.valueOf(str.charAt(i));
		}
		System.out.println(newStr);
	}

	public static <T> void reverseArray(T[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void NoOfWordsInString(String str) {
		String[] strArray = str.split(" ");
		System.out.println("No of words in string " + strArray.length);
	}

	public static void ArraySort(Integer[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void armstrongNumber(int n) {
		int arm = 0, temp, r;
		temp = n;
		while (n > 0) {
			r = n % 10;
			arm = arm + (r * r * r);
			n = n / 10;
		}
		if (temp == arm) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");
		}
	}

	public static void RemoveWhiteSpacesWithoutUsingReplaceMethod(String str) {
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
			if ((c != ' ') && (c != '\t')) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void reverseEachWordInString(String str) {
		String revStr = "";
		String[] wordArray = str.split(" ");
		for (String word : wordArray) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revStr = revStr + revWord + " ";
		}
		System.out.println(revStr);
	}

	public static void ASCIIValueofAlphabet(char c) {
		int i = c;
		System.out.println("ASCII value of " + c + " is " + i);
	}
	
	public static void CaptalizeFirstLastCharacterOfEachWord(String str) {
		String[] wordArray = str.split(" ");
		for(int i=0;i<wordArray.length;i++) {
			char[] ch = wordArray[i].toCharArray();
			ch[0] = Character.toUpperCase(ch[0]);
			ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);
			wordArray[i] = new String(ch); 
		}
		String result = String.join(" ", wordArray);
		System.out.println(result);
		
	}
	
	public static void Anagram(String str1, String str2) {
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		if(str1Array.length != str2.length()) {
			System.out.println("not anagram");
		}
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		System.out.println(Arrays.equals(str1Array, str2Array));
	}
	
	public static void convertStringtoInteger(String str) {
		int num = Integer.parseInt(str);
		System.out.println(num+10);
	}
	
	public static void convertIntegertostring(int n) {
		String str = Integer.toString(n);
		System.out.println(str+10);
	}
	
	public static void charactertointeger(char c) {
		int num = Integer.parseInt(String.valueOf(c));
		System.out.println(num);
	}
	
}
