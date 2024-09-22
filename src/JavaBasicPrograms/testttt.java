package JavaBasicPrograms;

public class testttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="a2b3c4";
		String numbers=str.replaceAll("[a-z]", "");
		String words=str.replaceAll("[0-9]", "");
		System.out.println(numbers);
		System.out.println(words);

	}

}
