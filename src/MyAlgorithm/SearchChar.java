package MyAlgorithm;

import java.io.IOException;
import java.util.Scanner;

public class SearchChar {
	
	
	public static void findChar(String text, char find) {
		
		for(int i=0; i<text.length(); i++)
		{
			if (find == text.charAt(i)){
				
				System.out.println(" Character : "+find+ " found at Location "+i);
			}
		}
	}

	public static void main(String[] args) {
		// Take user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		
		System.out.print("Enter Charater to find: ");
		
		char find = '0';
		
		try {
			find = (char) System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		findChar(text, find);

	}

}
