package Programs;

public class numberProblems {

	public static void main(String[] args) {
		polindrome(32523);
		factorial(5);
		armstrong(1543);
		fibonacci(5);

	}
	public static void polindrome(int n) {
		int rev=0, temp;
		temp = n;
		while(n>0) {
			rev = rev*10+n%10; 
			n= n/10;
		}
		if(temp==rev) {
			System.out.println("polindrome");
		}else {
			System.out.println("not polindrome");
		}
	}
	
	public static void factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result = result*i;
		}
		System.out.println(result);
	}
	
	public static void armstrong(int n) {
		int arm=0,temp,r;
		temp = n;
		while(n>0) {
			r = n%10;
			arm = arm+(r*r*r);
			n= n/10;
		}
		if(temp==arm) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstorng number");
		}
	}
	
	public static void fibonacci(int n) {
		int first =0, second = 1, next;
		for(int i=0;i<=n;i++) {
			System.out.println(first);
			next = first+second;
			first = second;
			second = next;
		}
	}
	
	
}
