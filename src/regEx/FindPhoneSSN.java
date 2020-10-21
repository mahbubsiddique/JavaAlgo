package regEx;

import java.util.regex.Pattern;

public class FindPhoneSSN {
	
	// given a string - if it is a phone number or ssn 
	// '111-11-1111' - output - this is SSN
	//'111-111-1111' - output - this is phone number
	// 111 - output - not a phone number or SSN
	// asda-sda-1111 - not a phone number or SSN

	public static void main(String[] args) {
		
		String pString = "111-111-1111";
		if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}", pString)==true)
			System.out.println("This is a phone number");
		else if(Pattern.matches("\\d{3}-\\d{2}-\\d{4}", pString)==true)
			System.out.println("This is a SSN");
		else
			System.out.println("This is not a phone or SSN");
	}//end main

}//end class
