package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class practice003string {

	public static void main(String[] args) {
		removeWhiteSpaces(" sandeep reddy ");
		duplicateCharactersInString("better butter");
		reverseeachwordInString("sandeep reddy");
		checkoneStringrotationofanotherString("sandeepreddypabbathi", "pabbathisandeepreddy");
		reverseStringwithpreservingSpaces("my name is sandeep reddy");
		checkAnagram("car", "arc");
		anagramusingstringbuilder("listen", "silent");
		longestsubstringwithoutrepeatingitscharacters("javaconceptoftheday");
		firstrepeatedandnonrepeatedcharactersinstring("sandeepreddy");
		CountNoOfWordsInString("sandeep reddy pabbathi");
		anagramwithMap("listen", "silent");
		RemoveDuplicateCharactersFromString("better butter");
		compareTwoStrings("sandeep", "sandeep");

	}

	public static void removeWhiteSpaces(String str) {
		str = str.replaceAll("\\s+", "");
		System.out.println(str);
		String strwithoutspaces = "";
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if ((c != ' ') && (c != '\t')) {
				strwithoutspaces = strwithoutspaces + c;
			}
		}
		System.out.println(strwithoutspaces);
	}

	public static void duplicateCharactersInString(String str) {
		char[] cArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : cArray) {
			charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
		}
		System.out.println(charCount);
		Set<Character> charInString = charCount.keySet();
		for (char c : charInString) {
			if (charCount.get(c) > 1) {
				System.out.println(c + " " + charCount.get(c));
			}
		}

	}

	public static void reverseeachwordInString(String str) {
		String reverseString = "";
		String[] words = str.split(" ");
		for (String word : words) {
			String reverseword = "";
			char[] charArray = word.toCharArray();
			for (int i = charArray.length - 1; i >= 0; i--) {
				reverseword += charArray[i];
			}
			reverseString += reverseword + " ";
		}
		System.out.println(reverseString);
	}

	public static void checkoneStringrotationofanotherString(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println("false");
		} else {
			String s3 = s1 + s1;
			if (s3.contains(s2)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	public static void reverseStringwithpreservingSpaces(String str) {
		char[] cArray = str.toCharArray();
		char[] resultArray = new char[cArray.length];
		for (int i = 0; i < cArray.length; i++) {
			if (cArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		int j = cArray.length - 1;
		for (int i = 0; i < cArray.length; i++) {
			if (cArray[i] != ' ') {
				if (resultArray[j] == ' ') {
					j--;
				}

				resultArray[j] = cArray[i];

				j--;
			}
		}

		System.out.println(String.valueOf(resultArray));
	}

	public static void checkAnagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		}
	}

	public static void anagramusingstringbuilder(String s1, String s2) {
		s1 = s1.replaceAll("\\s+", "");
		s2 = s2.replaceAll("\\s+", "");
		boolean status = true;
		if (s1.length() == s2.length()) {
			char[] s1Array = s1.toCharArray();
			StringBuilder sb = new StringBuilder(s2);
			for (char c : s1Array) {
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
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		}
	}

	public static void anagramwithMap(String str1, String str2) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (char c : str1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		System.out.println(map1.equals(map2));
	}

	public static void longestsubstringwithoutrepeatingitscharacters(String str) {
		char[] strArray = str.toCharArray();
		LinkedHashMap<Character, Integer> charpositionmap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < strArray.length; i++) {
			// If ch is not present in charPosMap, adding ch into charPosMap along with its
			// position
			if (!charpositionmap.containsKey(strArray[i])) {
				charpositionmap.put(strArray[i], i);
			} else {
				// If ch is already present in charPosMap, reposioning the cursor i to the
				// position of ch and clearing the charPosMap
				i = charpositionmap.get(strArray[i]);
				charpositionmap.clear();
			}
		}
		System.out.println(charpositionmap);
		System.out.println(charpositionmap.keySet().toString());
	}

	public static void firstrepeatedandnonrepeatedcharactersinstring(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : charArray) {
			charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
		}
		System.out.println(charCount);
		for (char c : charArray) {
			if (charCount.get(c) == 1) {
				System.out.println("non repeating characters: " + c);
				break;
			}
		}
		for (char c : charArray) {
			if (charCount.get(c) > 1) {
				System.out.println("repeating characters: " + c);
				break;
			}
		}
	}

	public static void CountNoOfWordsInString(String str) {
		long count = Arrays.stream(str.split(" ")).count();
		System.out.println(count);
	}

	public static void RemoveDuplicateCharactersFromString(String str) {
		char[] strArr = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : strArr) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

	public static void compareTwoStrings(String str1, String str2) {
		boolean isCompare = true;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				isCompare = true;
			} else {
				isCompare = false;
			}
		}
		if (isCompare) {
			System.out.println("two strings are equal");
		} else {
			System.out.println("two strings are not equal");
		}
	}

}
