package ReadInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		// Read single user input
				
		//Declare and initialize the object
		Scanner scn = new Scanner(System.in);
		
		//ask user for input - String
		System.out.print("Enter Your Name: ");
		//Read the data
		String name = scn.nextLine();
		
		//ask user input - number
		System.out.print("Enter your age:");
		//Read integer input
		int age = scn.nextInt();
		
		//display the input
		System.out.println("The name you entered: "+name+" Age is: "+age);
		
		

	}

}
