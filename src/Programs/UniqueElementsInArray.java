package Programs;

import java.util.ArrayList;
import java.util.List;

public class UniqueElementsInArray {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 1, 2, 4, 5, 6, 4, 7};
		List<Integer> uniqueList = new ArrayList<>();
		boolean isDuplicate = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				} else {
					isDuplicate = false;
				}
			}
			if (isDuplicate == false) {
				uniqueList.add(arr[i]);
			}
		}
		
		System.out.println(uniqueList);

	}

}
