package algo;

import java.util.regex.Pattern;

public class PatternRecog {

	public static void main(String[] args) {
		
		//phone number 718-218-3230
		//zipcode 11106
		//ssn 088-89-1234
		String input = "mahbub@yahoo.com";
		
		if(Pattern.matches("\\d{5}", input))
			System.out.println("This is a zipcode");
		else if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}", input))
			System.out.println("This is a phone number");
		else if(Pattern.matches("\\d{3}-\\d{2}-\\d{4}", input))
			System.out.println("This is a SSN");	
		else if(Pattern.matches("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}", input)) 
			System.out.println("This is an Email");
	}
}
