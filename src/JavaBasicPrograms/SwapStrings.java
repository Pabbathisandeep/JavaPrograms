package JavaBasicPrograms;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping strings
        String temp = str1;
        str1 = str2;
        str2 = temp;

        // Alternatively, you can directly swap the strings without using a temporary variable
        // str1 = str1 + str2;
        // str2 = str1.substring(0, str1.length() - str2.length());
        // str1 = str1.substring(str2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}