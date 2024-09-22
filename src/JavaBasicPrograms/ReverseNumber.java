package JavaBasicPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int number =121; // Change this to the number you want to reverse
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number/10;
        }

        System.out.println("Reversed number: " + reversedNumber);
        System.out.println("Actual number: " + number);
        if(reversedNumber==121) {
        	System.out.println("Number is parlindrome");
        }
        else {
        	System.out.println("Number is not a parlindrome");
        }
    }
}
