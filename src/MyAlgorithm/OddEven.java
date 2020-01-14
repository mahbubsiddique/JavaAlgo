package BasicAlgorithms;

import java.util.Scanner;

public class OddEven {
	
	/*
	 * 9. Identify Odd Even
Any integer that can be divided exactly by 2 is an even number.

The logic: Check for the remainder when number is divided by 2. If the remainder is 0, the number is even – else odd.
	 * 
	 */
	
	
	public static void main(String args[]) {
		 
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter number to check even or odd"); 
		int n=in.nextInt();   
		if(n%2==0){
		  System.out.println(+n+" is even number");
		} else{
		System.out.println(+n+" is odd number"); 
		}
		in.close();
	}
	
	

}
