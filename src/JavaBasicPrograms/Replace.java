package JavaBasicPrograms;

public class Replace {
	public static void main(String[] args) {
		
		String str="a2b3c4&^";
		String replaced = str.replaceAll("[0-9&^]", "");
		str.replaceAll("[0-9]", " ");
		System.out.println(replaced);
	}

}
