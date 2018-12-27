package BasicAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class identifyPalindrome {
	//Write Java Code To Identify A Number As Palindrome
	
	public static void main(String[] args) {

		try {
			BufferedReader object = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Input number");
			int inputValue = Integer.parseInt(object.readLine());
			int n = inputValue;
			int rev = 0;
			System.out.println("Input value is : ");
			System.out.println(" " + inputValue);
			for (int i = 0; i <= inputValue; i++) {
				int r = inputValue % 10;
				inputValue = inputValue / 10;
				rev = rev * 10 + r;
				i = 0;
			}
			System.out.println("Post reversal : " + " ");
			System.out.println(" " + rev);
			if (n == rev) {
				System.out.print("Input value is a palindrome.");
			} else {
				System.out.println("Input value is not a palindrome.");
			}
		} catch (Exception e) {
			System.out.println("Out of Range.");
		}
	}
	

}
