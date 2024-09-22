package JavaBasicPrograms;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6,7,5};
		int n= arr.length+1;
		int sum=(n*(n+1))/2;
		int arraysum=0;
		for(int count: arr) {
			arraysum=arraysum+count;
			
			
		}
		int missingnum=sum-arraysum;
		System.out.println(arraysum);
		System.out.println(missingnum);
		
}
}