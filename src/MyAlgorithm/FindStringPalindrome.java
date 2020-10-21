package MyAlgorithm;

import java.util.Scanner;

public class FindStringPalindrome {
	
	public static Boolean isPalindrome(String text) {
		
		String reverse = "";
		
		for(int i=text.length()-1; i>=0; i--) {
			
			reverse = reverse+text.charAt(i);
		}
			
		
		if (reverse.equals(text))
			return true;
		else
			return false;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Text: ");
		String text = sc.nextLine();
		
		Boolean p = isPalindrome(text);
		
		System.out.println(p);

	}

}
