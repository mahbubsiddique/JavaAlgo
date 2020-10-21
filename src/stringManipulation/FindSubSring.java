package stringManipulation;

import java.util.ArrayList;

import com.gargoylesoftware.htmlunit.util.StringUtils;

public class FindSubSring {

	public static void main(String[] args) {
		
		String name = "careerhackee";
		String find = "ee";
		//ArrayList<String> cont = new ArrayList<>();
	
		
		if(name.contains(find))
			System.out.println("Substring is present");
		else
			System.out.println("Substring is Not present");

	}

}
