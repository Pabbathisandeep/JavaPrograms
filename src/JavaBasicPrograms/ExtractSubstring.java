package JavaBasicPrograms;

public class ExtractSubstring {

    public static void main(String[] args) {
        String test = "automation(fission)@gmail.com";
        int startIndex = test.indexOf('(')+1;
        int endIndex = test.indexOf(')');
        
		/*
		 * if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) { String
		 * result = test.substring(startIndex + 1, endIndex);
		 * System.out.println("Output: " + result); } else {
		 * System.out.println("No substring found between parentheses."); }
		 */
        String updatedtest=test.substring(startIndex, endIndex);
        System.out.println(updatedtest);
    }
}

