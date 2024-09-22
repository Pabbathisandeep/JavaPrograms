package JavaBasicPrograms;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World Java Programming";

        System.out.println("Original String: " + input);

        // Reverse the order of words without using a method
        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        System.out.println("Reversed String: " + reversedString.toString().trim());
    }
}


