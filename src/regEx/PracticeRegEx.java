package regEx;

import java.util.regex.*;

public class PracticeRegEx {

	public static void main(String[] args) {
		String name = " Career Hack 718-218-3230 1-646-504-6050 AK Career Camp 718 641 2730 CareerFest@yahoo.com PA iCareer Camp 11417 Career NY";
		// find a zip code
		// String pString = "\\s\\d{5}\\s";
		// find state abbreviation that starts with A or P
		// String pString = "A[a-zA-Z]|P[a-zA-Z]";
		// String pString = "A[a-zA-Z]|P[a-zA-Z]";
		// find email address such as -- CareerFest@yahoo.com
		String pString = "[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}";
		//find a phone number such as 718-218-3230	
		//String pString = "\\d{3}-\\d{3}-\\d{4}";
		//find a phone number such as 718-218-3230 1-646-504-6050 718 641 2730
		//String pString = "([0-9])?(-)?\\d{3}(-| )?\\d{3}(-| )?\\d{4}";
				
		Pattern pattern = Pattern.compile(pString);
		Matcher m = pattern.matcher(name);
		while (m.find()) {
			if (m.group().length() != 0) {
				System.out.println(m.group().trim());
			} else {
				System.out.println("No matches found");
			}
		} // end of while
	}// end main
}// end class
