package JavaBasicPrograms;

public class RepeatCharacters {
    public static void main(String[] args) {
        String str = "a2b3c4";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int repeat = Character.getNumericValue(str.charAt(++i));
                for (int j = 0; j < repeat; j++) {
                    result.append(ch);
                }
            }
        }

        System.out.println(result.toString());
    }
}

