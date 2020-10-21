package controlStructure;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a Value: ");
		String text = scn.nextLine();
		
		switch(text){
		
		case "start":
			System.out.println("Start the machine");
			break;
		case "stop":
			System.out.println("Stop the machine");
			break;
		case "exel":
			System.out.println("Excell the machine");
			break;
		default:
			System.out.println("Wrong command");		
		}//end switch
		
	}//end main

}//end class
