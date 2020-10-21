package MyAlgorithm;

import java.util.regex.*;

public class FindSubStr {
	
	//find numerics from a string

	public static void main(String[] args) {
		String input = "mahbub12345siddique9876543";
	//	String find = "[a-zA-Z0-9]+\\d{2,}[a-zA-Z0-9]+";
		String find = "\\D{1,}";
		
		Pattern pattern = Pattern.compile(find);
		Matcher m = pattern.matcher(input);
		while(m.find()) {
			System.out.println(m.group());
		}		
	}
}