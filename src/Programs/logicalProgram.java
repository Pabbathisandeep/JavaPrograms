package Programs;

import java.util.ArrayList;
import java.util.Stack;

public class logicalProgram {

	public static void main(String[] args)
	{
		int[] arr1 = { 30, 43, 93, 40, 36, 98 };
		leaders(6, arr1);
	}

	// Function to find the leaders in the array.
	public static void leaders(int n, int arr[]) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			flag = true;
			for (int j = i + 1; j <= n - 1; j++) {

				if (arr[i] < arr[j]) {
					System.out.println(arr[i]);
					flag = false;
					break;
				}
			}
			if (flag) {

				arrList.add(arr[i]);
			}
		}
		System.out.println(arrList);
	}
}

//String[] arr = {"[", "{", "(",")","}","]"};
//Stack<String> stack  = new Stack<String>();
//for(String c:arr) {
//	if(c=="["|| c=="{"||c=="(") {
//		stack.push(c);
//	}else {
//		if(c == ")"&& stack.peek() == "(") {
//			stack.pop();
//		}
//		else if(c=="}" && stack.peek() == "{") {
//			stack.pop();
//		}
//		else if(c=="]" && stack.peek() == "[") {
//			stack.pop();
//		}
//		else {
//			stack.push(c);
//		}
//	}
//	
//}
//if(stack.size()==0) {
//	System.out.println("valid string");
//}else {
//	System.out.println("invalid");
//}
