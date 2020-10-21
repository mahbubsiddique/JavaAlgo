package regEx;

import java.util.regex.*;

public class SimpleRegEx {

	public static void main(String[] args) {

		String input = "MahbubSiddique";
		String pString = "Mahbub";

		Pattern pattern = Pattern.compile(pString);
		Matcher m = pattern.matcher(input);
		if (m.find()) {
			System.out.println(m.start() + " " + m.end());
			System.out.println(m.group());
		} else {
			System.out.println("No Match");
		}
	}// end main

}// end class
