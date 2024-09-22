package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class practice001 {

	public static void main(String[] args) {
		reverseString("sandeep");
		swaptwonumberswithoutusing3rdvariable(10, 20);
		checkVowelPresentInString("sandeep");
		System.out.println(primenumber(101));
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciUsingrecursion(i) + " ");
		}
		int[] arr = { 1, 3, 5, 9 };
		System.out.println(checkListContainOnlyOddNumber(arr));
		removespacesfromstring("sa s ndseg vfdxv ");
		int[] intarr = { 1, 5, 3, 4, 8, 9, 1, 0 };
		sortArray(intarr);
		factorial(5);
		System.out.println(secondlargestNumberInArray(intarr));
		removeDuplicatesFromString("sandeep");
		anagram("barc", "crab");
		System.out.println(getFirstNonRepeatedChar("sandeep"));
		printevenlengthwordsinstring("sandeep reddy pabbathi");
		sortCharactersInString("sandeep");
		vowelCount("sandeep reddy");
		wordsInString("sandeep reddy");
		compareStrings("sandeep", "sandeep");
		frequencyOfEachCharacter("sandeep reddy pabbathi");
		capitilizeEachWordInString("today is 2nd day of the week");
		generateRandomString();
		AnagramUsingStreams("Listen", "Silent");
		capitilizeEachWord("iam sandeep reddy");
		randomEmailId("gmail.com");
		int[] arr2= {2,1,5,2,3,2,5,4,7};
		smallestSubArray(arr2,7);
		
	}

	public static void reverseString(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
	}

	public static void swaptwonumberswithoutusing3rdvariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

	public static void checkVowelPresentInString(String str) {
		boolean vowelPresent = false;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelPresent = true;
				break;
			}
		}
		if (vowelPresent) {
			System.out.println("the string contains atleast one vowel");
		} else {
			System.out.println("the string not contains vowels");
		}
	}

	public static boolean primenumber(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int fibonacciUsingrecursion(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciUsingrecursion(n - 1) + fibonacciUsingrecursion(n - 2);
	}

	public static boolean checkListContainOnlyOddNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				return false;
			}

		}
		return true;
	}

	public static void removespacesfromstring(String str) {
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static int factorialUsingrecursion(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorialUsingrecursion(n - 1));
		}
	}

	public static int secondlargestNumberInArray(int[] arr) {
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			} else if (i > secondLargest) {
				secondLargest = i;
			}
		}
		return secondLargest;
	}

	public static void removeDuplicatesFromString(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		System.out.println(set);
		System.out.println(sf);
	}

	public static void anagram(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		if (c1.length == c2.length) {
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("not anagram");
			}
		} else {
			System.out.println("not anagram");
		}
	}

	public static char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated characters");
	}
	
	public static void printevenlengthwordsinstring(String str) {
		String[] strArray = str.split(" ");
		for(String word:strArray) {
			if(word.length()%2 == 0) {
				System.out.println(word);
			}
		}
	}
	
	public static void sortCharactersInString(String str) {
		char[] cArray = str.toCharArray();
			Arrays.sort(cArray);
			String sortedArray = new String(cArray);
			System.out.println(sortedArray);
	}
	
	public static void vowelCount(String str) {
		char[] cArray = str.toCharArray();
		int count = 0;
		for(char c:cArray) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;				
				break;
			}
		}
		System.out.println("No of vowels in string "+count);
	}
	
	public static void wordsInString(String str) {
		String[] words = str.split(" ");
		for(String word:words) {
			int charCount = 0;
			for(int i=0;i<word.length();i++) {
				charCount++;
			}
			System.out.println(word+" "+charCount);
		}
	}
	
	public static void compareStrings(String str1, String str2) {
		boolean isCompare = false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				isCompare= false;
				break;
			}
			isCompare = true;
		}
		System.out.println("both the strings are equal :"+isCompare);
	}
	
//	print no of words, vowels, frequency of each character in string
	public static void frequencyOfEachCharacter(String str) {
		String[] words = str.split(" ");
		System.out.println("No of words :"+words.length);
		for(String word: words) {
			int vowelCount = 0;
			for(int i=0;i<word.length();i++) {
				char c = word.charAt(i);
				switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowelCount++;
					break;
				}
			}
			System.out.println(word+" No of vowels :"+vowelCount);
			Map<Character, Integer> charCount = new HashMap<Character, Integer>();
			char[] cArray = word.toCharArray();
			for(char c:cArray) {
				if(charCount.containsKey(c)) {
					charCount.put(c, charCount.get(c)+1);
				}else {
					charCount.put(c, 1);
				}
			}
			System.out.println(charCount);
			Set<Character> charInString = charCount.keySet();
			for(char c:charInString) {
				if(charCount.get(c)>1) {
					System.out.println(c+" :"+charCount.get(c));
				}
			}
		}		
	}
	public static void capitilizeEachWordInString(String str) {
		String[] words = str.split(" ");
		String[] captilizedWords = new String[words.length];
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			if(word.length()>0) {
			captilizedWords[i] = Character.toUpperCase(word.charAt(0))+word.substring(1);
			}else {
				captilizedWords[i] = word;	
			}
		}
		String modifiedString = String.join(" ", captilizedWords);
		System.out.println(modifiedString);
	}
	
	public static void generateRandomString() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		while(sb.length()<10) {
			int index = (int)(rand.nextFloat()*characters.length());
			sb.append(characters.charAt(index));
		}
		System.out.println(sb.toString());
	}
	
	public static void AnagramUsingStreams(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("not anagrams");
		}else {
			String sortedS1 = s1.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			String sortedS2 = s2.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			if(sortedS1.equals(sortedS2)) {
				System.out.println("Anagrams");
			}
		}
	}
	
	public static void capitilizeEachWord(String str) {
		String[] words = str.split(" ");
		String[] captilizewords = new String[words.length];
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			if(word.length()>0) {
				captilizewords[i] = Character.toUpperCase(word.charAt(0))+word.substring(1);
			}else {
				captilizewords[i] = word;
			}
		}
		String modifiedString = String.join(" ", captilizewords);
		System.out.println(modifiedString);
	}
	
	public static void randomEmailId(String domain) {
		String currentTime = String.valueOf(System.nanoTime());
		String username = currentTime.substring(currentTime.length()-8);
		System.out.println(username+"@"+domain);
	}
	
	public static void smallestSubArray(int[] arr, int s) {
//			int[] arr2= {2,1,5,2,3,2};
		
		int sum=0, max=arr.length, start=0, end=0;
		for(int i=0;i<arr.length;i++) {
			sum = arr[i];
			if(sum==s) {
				start = i;
				end = i;
				break;
			}
			for(int j=i+1;j<arr.length;j++) {
				sum += arr[j];
				if(sum<7) {
					continue;
				}else if(sum==7) {
					if(max>(j-i)+1) {
						start = i;
						end = j;
						max = (j-i)+1;
					}
				}else {
					sum = 0;
					break;
				}
			}
		}
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	
	

}
