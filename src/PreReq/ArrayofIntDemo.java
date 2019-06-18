package PreReq;

public class ArrayofIntDemo {

	public static void main(String[] args) {
		
		//Declare integer Array - by allocating memory
		//Step 1 - declare array variable
		int[] myArray;
		//step 2 - create Array object
		myArray = new int[3];
		
		//Step 3: initialize array with values
		myArray[0] = 5;
		myArray[1] = 10;
		myArray[2] = 3;
		
		System.out.println("Value 1 is:"+ myArray[0]);
		
		
		//Declare integer array - by assigning list of values
		
		int[] listValues = {2, 7, 1, 8, 3};
		
		System.out.println(listValues);
		
		for(int i=0;i<listValues.length; i++) {
			System.out.println("List Value: "+i+": "+listValues[i]);
		}//end of for
		

	}//end of main

}//end of class
