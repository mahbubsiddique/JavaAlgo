package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubStr {

	public static void main(String[] args) {
		
		String text = "catcowcat";
		
		String find = "cat";
		
		Pattern pattern = Pattern.compile(find);
		Matcher m = pattern.matcher(text);
		
		int count = 0;
		
		while(m.find()) {
			count++;
		}
		System.out.println(count);

	}

}
