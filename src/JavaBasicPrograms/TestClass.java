package JavaBasicPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
	public String extractEmailAddressFromMail(String body) {
		Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("shiva");
		Matcher m = VALID_EMAIL_ADDRESS_REGEX.matcher(body);
		while (m.find()) {
			return m.group();
			
		}
		//String test= m.group();
		
		System.out.println(m.group());
		return  m.group();
	}
	

	public static void main(String[] args) {
		
		TestClass test= new TestClass();
		test.extractEmailAddressFromMail("tets ^%56 shiva");
		System.out.println();
		
		
	}

}
