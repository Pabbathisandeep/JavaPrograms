package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeAll005 {

	public static void main(String[] args) {
		duplicateCharactersInString("better butter");
		duplicateCharactersWithItsCount("fission labs");
		polindrome("sanas");
		Anagram("listen", "silent");
		AnagramWithoutHashmap("listen", "silent");
		removeSpecialCharactersInString("sandeep reddy @18#%^");
		countNoOfWordsInString("sandeep reddy pabbathi");
		removeWhiteSpacesWithoutUsingReplaceAll("sandeep reddy pabbathi");
		reverseEachWordInString("my name is sandeep");
		retrievSubString("automation(fission)@gmail.com");
		ASCIIValueofAlphabet('A');
		capitalizeFirstLastLetterOfEachWord("sandeep reddy");
		checkCharacterVowelorConsonant('G');
		checkCharacterisAlphabet('A');
		countNoOfVowels("sandeep");
		countNumbersInString("sandeep126545");
		frequencyofCharactersInString("sandeep reddy");
		removeJunkInString("sandeep@$#%%7reddy");
		countCaptalizedWordsInString("SandeepReddy");
		firstNonRepeatedCharacterInString("sandeep");
		longestSubstringWithoutRepeatingCharactersInString("sandeep");
		replaceCharacterWithItsOccurrance("sandeepreddy");
		sortCharactersAlphabetically("sandeepreddy");
		maxOccurranceOfCharacterInString("sandeepreddy");
		firstRepeatedCharacterInString("sandeep");
		convertStringtoCapitalCase("sandeep reddy pabbathi");
		checkStringContainAllUniqueCharacters("sandeep");

//		Find all permutations of string
//		find the longest polindromic sub string in string
//		remove all adjancent duplicates in string
//		Implement string compression("aaabbc ==> a3b2c1)
//		Find length of the longest substring with distinct characters

		Fibonacci(5);
		PrimeNumber(103);
		Polindrome(12321);
		ArmstrongNumber(153);
		factorial(5);
		FactorsOfNumber(75);
		FizzBuzzNumbers(100);
		LeapYear(2000);
		SwapTwoNumbers(2, 5);

//		Arrays
		int[] arr = { 2, 5, 6, 4, 1, 2, 6, 8, 7 };
		DuplicateValuesInArray(arr);
		UniqueElementsInArray(arr);
		SortArray(arr);
		MaxMinElementInArray(arr);
		SecondSmallestElementInArray(arr);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 6, 8, 9, 4, 3));
		RemoveDuplicateElementsInArrayList(list);
		SecondHighestNumberInArray(arr);
		ReverseElementsInArray(arr);
		CountOddEvenNumbersInArray(arr);
		DistinctElementsInArray(arr);

	}

	public static void duplicateCharactersInString(String str) {
		char[] cArray = str.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			for (int j = i + 1; j < cArray.length; j++) {
				if (cArray[i] == cArray[j]) {
					System.out.print(cArray[i]);
				}
			}
		}
	}

	public static void duplicateCharactersWithItsCount(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : charArray) {
			charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
		}
		System.out.println(charCount);
		Set<Character> charInString = charCount.keySet();
		for (char c : charInString) {
			if (charCount.get(c) > 1) {
				System.out.println(c + ":" + charCount.get(c));
			}
		}
	}

	public static void polindrome(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		if (revStr.equals(str)) {
			System.out.println("Polindrome");
		} else {
			System.out.println("not polindrome");
		}
	}

	public static void Anagram(String s1, String s2) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (char c : s1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		for (char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		if (map1.equals(map2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

	public static void AnagramWithoutHashmap(String s1, String s2) {
		boolean status = true;
		char[] c1Arr = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for (char c : c1Arr) {
			int index = sb.indexOf("" + c);
			if (index != -1) {
				sb = sb.deleteCharAt(index);
				if (sb.length() == 0) {
					status = true;
				}
			} else {
				status = false;
				break;
			}
		}

		if (status) {
			System.out.println("Anagram");
		} else {
			System.out.println("not anagram");
		}
	}

	public static void removeSpecialCharactersInString(String str) {
		System.out.println(str.replaceAll("\\D", "")); // this will gives you numbers in the string
		System.out.println(str.replaceAll("\\s+", "")); // Remove white spaces
		System.out.println(str.replaceAll("[0-9]", "")); // Remove numbers
		System.out.println(str.replaceAll("[^0-9]", "")); // Remove other than numbers
		System.out.println(str.replaceAll("[a-z]", "")); // Remove characters
		System.out.println(str.replaceAll("[^a-z]", "")); // Remove other than characters
		System.out.println(str.replaceAll("[aeiou]", "")); // Remove vowels from string
	}

	public static void countNoOfWordsInString(String str) {
		String[] words = str.split(" ");
		System.out.println("Total No of words in string are : " + words.length);
	}

	public static void removeWhiteSpacesWithoutUsingReplaceAll(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i) != '\t')) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}

	public static void reverseEachWordInString(String str) {
		String[] words = str.split(" ");
		String revStr = "";
		for (String word : words) {
			String revWord = "";
			char[] charArray = word.toCharArray();
			for (int i = charArray.length - 1; i >= 0; i--) {
				revWord += charArray[i];
			}
			revStr += revWord + " ";
		}
		System.out.println(revStr);
	}

	public static void retrievSubString(String str) {
		String newStr = "";
		int startsFrom = 11, endsBefore = 18;
		for (int i = startsFrom; i < endsBefore; i++) {
			newStr += String.valueOf(str.charAt(i));
		}
		System.out.println(newStr);
	}

	public static void ASCIIValueofAlphabet(char c) {
		int a = c;
		System.out.println(a);
	}

	public static void capitalizeFirstLastLetterOfEachWord(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			ch[0] = Character.toUpperCase(ch[0]);
			ch[ch.length - 1] = Character.toUpperCase(ch[ch.length - 1]);
			words[i] = new String(ch);
		}
		String result = String.join(" ", words);
		System.out.println(result);

	}

	public static void checkCharacterVowelorConsonant(char c) {
		c = Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("character " + c + " is vowel");
		} else {
			System.out.println("character " + c + " is consonant");
		}
	}

	public static void checkCharacterisAlphabet(char c) {
		if (Character.isAlphabetic(c)) {
			System.out.println("character " + c + " is alphabet");
		} else {
			System.out.println("character " + c + "is not alphabet");
		}
	}

	public static void countNoOfVowels(String str) {
		char[] cArray = str.toCharArray();
		int count = 0;
		for (char c : cArray) {
			if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i'
					|| Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
				count++;
			}
		}
		System.out.println("no of vowels are: " + count);
	}

	public static void countNumbersInString(String str) {
		int sum = 0;
		char[] cArray = str.toCharArray();
		for (char c : cArray) {
			if (Character.isDigit(c)) {
				sum += Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println(sum);
	}

	public static void frequencyofCharactersInString(String str) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
		}
		System.out.println(charCount);
	}

	public static void removeJunkInString(String str) {
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str.replaceAll("[^\\w\\s]", ""));
	}

	public static void countCaptalizedWordsInString(String str) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				count++;
			}
		}
		System.out.println("captalized words in string " + str + " is " + count);
	}

	public static void firstNonRepeatedCharacterInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char currentCharacter = str.charAt(i);
			boolean isRepeated = false;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && currentCharacter == str.charAt(j)) {
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated) {
				System.out.println(currentCharacter);
				break;
			}
		}
	}

	public static void longestSubstringWithoutRepeatingCharactersInString(String str) {
//		str = sandeep;
		String longestSubstring = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(j))
					longestSubstring += str.charAt(i);
				break;
			}
		}
		System.out.println(longestSubstring);
	}

	public static void replaceCharacterWithItsOccurrance(String str) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
			sb.append(charCount.get(c));
		}
		System.out.println(sb.toString());

	}

	public static void sortCharactersAlphabetically(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println(new String(charArray));
	}

	public static void maxOccurranceOfCharacterInString(String str) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		char maxChar = '\0';
		int maxCount = 0;
		for (Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}

		}
		System.out.println("max occurrance of character is " + maxChar + " : " + maxCount);
	}

	public static void firstRepeatedCharacterInString(String str) {
		HashSet<Character> seenChars = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			if (seenChars.contains(c)) {
				System.out.println(c);
			}
			seenChars.add(c);
		}
	}

	public static void convertStringtoCapitalCase(String str) {
		String[] words = str.split(" ");
		StringBuilder titleCase = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				String capitalizeword = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				titleCase.append(capitalizeword).append(" ");
			}
		}
		System.out.println(titleCase);
	}

	public static void checkStringContainAllUniqueCharacters(String str) {
		boolean isDuplicate = false;
		char[] cArray = str.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			for (int j = i + 1; j < cArray.length; j++) {
				if (cArray[i] == cArray[j]) {
					isDuplicate = true;
					break;
				}
			}
		}
		if (!isDuplicate) {
			System.out.println("String contain all unique characters");
		} else {
			System.out.println("string not contain unique characters");
		}
	}

	public static void Fibonacci(int n) {
		int first = 0, second = 1, next;
		for (int i = 0; i <= n; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}
	}

	public static void PrimeNumber(int n) {
		boolean isPrime = false;
		if (n > 2) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				System.out.println(n + " is prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}
	}

	public static void Polindrome(int n) {
		int rev = 0;
		int temp = n;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " Polindrome");
		} else {
			System.out.println(temp + " not a polindrome");
		}
	}

	public static void ArmstrongNumber(int n) {
		int arm = 0;
		int temp = n;
		while (n > 0) {
			int r = n % 10;
			arm = arm + (r * r * r);
			n = n / 10;
		}
		if (arm == temp) {
			System.out.println(temp + " Armstrong number");
		} else {
			System.out.println(temp + " not an Armstrong number");
		}
	}

	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void FactorsOfNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void FizzBuzzNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void LeapYear(int n) {
		if (n % 400 == 0) {
			System.out.println(n + " Leap Year");
		} else if ((n % 4 == 0) && (n % 100 != 0)) {
			System.out.println(n + " Leap Year");
		} else {
			System.out.println(n + " is not Leap Year");
		}
	}

	public static void SwapTwoNumbers(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("the value of a is :" + a);
		System.out.println("the value of b is :" + b);
	}

	public static void DuplicateValuesInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

	public static void UniqueElementsInArray(int[] arr) {
		boolean isDuplicate = false;
		List<Integer> UniqnueArray = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				} else {
					isDuplicate = false;
				}
			}
			if (!isDuplicate) {
				System.out.print(" " + arr[i]); // Unique elements in array
				UniqnueArray.add(arr[i]);
			}
		}
		System.out.println(UniqnueArray.toString()); // unique array
	}

	public static void SortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void MaxMinElementInArray(int[] arr) {
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max element in array is :" + max);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min element in array is :" + min);
	}

	public static void SecondSmallestElementInArray(int[] arr) {
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[0];
			}
		}
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] != smallest) && (arr[i] < secondSmallest)) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("second smallest number in array is: " + secondSmallest);

	}

	public static void RemoveDuplicateElementsInArrayList(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		for (int ele : list) {
			if (!newList.contains(ele)) {
				newList.add(ele);
			}
		}
		System.out.println(newList);
	}

	public static void SecondHighestNumberInArray(int[] arr) {
		int largest = 0, secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] != largest) && (arr[i] > secondLargest)) {
				secondLargest = arr[i];
			}
		}

		System.out.println("second largest value is: " + secondLargest);

	}

	public static void ReverseElementsInArray(int[] arr) {
		List<Integer> revArr = new ArrayList<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr.add(arr[i]);
		}
		System.out.println(revArr);
	}

	public static void CountOddEvenNumbersInArray(int[] arr) {
		int oddCount = 0, evenCount = 0;
		for (int ele : arr) {
			if (ele % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("No of odd elements in array is :" + oddCount);
		System.out.println("No of even elements in array is :" + evenCount);
	}

	public static void DistinctElementsInArray(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int ele : arr) {
			map.put(ele, map.getOrDefault(ele, 0) + 1);
		}
		System.out.println(map.keySet());
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//		Repeating values
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
//		Non Repeating values
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
