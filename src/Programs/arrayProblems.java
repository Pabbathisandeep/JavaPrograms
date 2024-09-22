package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayProblems {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 8, 4, 0, 5, 0, 6, 2 };
		maxminElementsInArray(arr);
		sortArray(arr);
		removeDuplicates(arr);
		printDuplicateValues(arr);
		String[] strarr = { "sandeep", "reddy", "sandy", "reddy" };
		removeDuplicatesInArrayList(strarr);
		secondlargestnumber(arr);
		reverseArray(arr);
		movezerostoEndofArray(arr);

	}

	public static void maxminElementsInArray(int[] arr) {
		int max = arr[0], min = arr[0], temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				temp = arr[i];
				arr[i] = max;
				max = temp;
			} else if (arr[i] < min) {
				temp = arr[i];
				arr[i] = min;
				min = temp;
			}
		}
		System.out.println(max + " " + min);
	}

	public static void sortArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void removeDuplicates(int[] arr) {

		List<Integer> uniqueList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueList.add(arr[i]);
			}
		}
		System.out.println(uniqueList);

	}

	public static void printDuplicateValues(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void removeDuplicatesInArrayList(String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		List<String> newList = new ArrayList<String>();
		for (String ele : list) {
			if (!newList.contains(ele)) {
				newList.add(ele);
			}
		}
		System.out.println(newList);
	}

	public static void secondlargestnumber(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			} else if (num > secondlargest && num != largest) {
				secondlargest = num;
			}
		}

		System.out.println(secondlargest);
	}

	public static void reverseArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void movezerostoEndofArray(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
