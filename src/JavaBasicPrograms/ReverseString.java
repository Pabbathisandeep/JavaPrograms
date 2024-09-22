package JavaBasicPrograms;

public class ReverseString {
public static void main (String[] args) {
        
        String str="ivasav test ";
        String rev= "";
        
        char ch;
        for(int i=0;i<str.length();i++) {
        	ch=str.charAt(i);
        	rev=ch+rev;
        }
        
       System.out.println(" revrsed word is : " +rev);
}
}