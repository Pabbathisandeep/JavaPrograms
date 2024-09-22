package JavaBasicPrograms;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {8,2,5,9,3,52,15,11,6,4,7,32};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				System.out.println("even numbers are "+ arr[i]);
			}
		}

	}

}
