package MyAlgorithm;

import java.util.Scanner;

public class OddEven {
	
	//Method 1
	
	public void oddEven1() {
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter number to check even or odd"); 
		int n=in.nextInt();   
		if(n%2==0){
		  System.out.println(+n+" is even number");
		} else{
		System.out.println(+n+" is odd number"); 
		}
		in.close();		
	}//end oddEven1
	
	
	//Method 2 - using ArrayList
	
	
	public static void main(String args[]) {
		
		OddEven oe1 = new OddEven();
		oe1.oddEven1();
		 
	}//end main
	
}//end class
