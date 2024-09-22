package JavaBasicPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 4; // Change this to the number you want to check
        int count=0;
        
        if(number>1) {
        	
        	for(int i=1;i<=number;i++) {
        		if(number%i==0)
        		count++;
        	}
        		if(count==2) {
        			System.out.println(" given number is prime");
        		}
        		else {
        			System.out.println(" given number is not prime");
        		}
        }
        	
        
        else {
        	System.out.println("Number is not the prime number :");
        }

}}