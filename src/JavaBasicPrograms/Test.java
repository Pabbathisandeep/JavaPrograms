package JavaBasicPrograms;

public class Test {
	
	public static void main(String[] args) {
	String str1 = "Hello";
    String str2 = "World";
    String str3 = "HelloWorld";
    String str4= str1+str2;
    System.out.println(str4);
    str4 = str4.intern();
   
System.out.println(str3 == str4);
System.out.println(str3.equals(str4));

}
}