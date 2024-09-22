package JavaBasicPrograms;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String inputString = "Vasavi test";
        String[] words = inputString.split(" ");
        StringBuilder reversedStringBuilder = new StringBuilder();

        for (String word : words) {
            char[] chars = word.toCharArray();
            int start = 0;
            int end = word.length() - 1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

            reversedStringBuilder.append(new String(chars)).append(" ");
        }

        String reversedString = reversedStringBuilder.toString().trim();
        System.out.println(reversedString);
    }
}
