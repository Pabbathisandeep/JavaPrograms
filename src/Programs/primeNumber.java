package Programs;

public class primeNumber {

	public static void main(String[] args) {
		boolean flag = false;
		int n = 6;
		if (n <= 1) {
			System.out.println("not a prime number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a prime number");
			}
		}

	}

}
