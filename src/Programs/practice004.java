package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class practice004 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 9, 8, 5, 2, 3, 5 };
		System.out.println(removeDuplicates(arr));
		secondlargestElementInArray(arr);
		pairElementsinArray(arr, 8);
		differentWaysToPrintElementsInArray(arr);
		int[] arr2 = {3, 5, 1, 4, 2,6};
		MedianOfArray(arr2);
		PrintAltrenateElementsInArray(arr);

	}

	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
		for (int ele : arr) {
			if (!uniqueList.contains(ele)) {
				uniqueList.add(ele);
			}
		}
		return uniqueList;
	}
	
	public static void secondlargestElementInArray(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int number:arr) {
			if(number>largest) {
				secondLargest = largest;
				largest = number;
			}else if(number>secondLargest && number !=largest) {
				secondLargest = number;
			}
		}
		System.out.println(secondLargest);
	}
	
	public static void pairElementsinArray(int[] arr, int n) {
		Arrays.sort(arr);
		int j = arr.length-1;
		int i=0;
		while(i<j) {
			if(arr[i]+arr[j]==n) {
				System.out.println(arr[i]+"+"+arr[j]+"="+n);
				i++;
				j--;
			}
			else if(arr[i]+arr[j]<n) {
				i++;
			}
			else if(arr[i]+arr[j]>n) {
				j--;
			}
		}
	}
	
	public static void differentWaysToPrintElementsInArray(int[] arr) {
		Arrays.stream(arr).forEach(System.out::println);
		Arrays.asList(arr).forEach(element->System.out.println(element));
		Stream.of(arr).forEach(element-> System.out.println(element));
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
	
	public static void MedianOfArray(int[] arr) {
		int n= arr.length;
		System.out.println("******");
		Arrays.sort(arr);
		if(n%2 == 1) {
			System.out.println(arr[n/2]);
		}else {
			System.err.println((arr[(n / 2) - 1] + arr[n / 2]) / 2.0);
		}
	}
	
	public static void PrintAltrenateElementsInArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
