package algo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int [] x = {18, 7, 8, 90, 5, 21, 33, 87, 98, 4};
		List<String> fb = new ArrayList<String>();
		//display Fizz - if a value is divisible by 3
		//display Buzz - if a value is divisible by 7
		//display FizzBuzz - if a value is divisible by 3 and 7		
		for(int i=0; i<x.length; i++) {			
			if (x[i]%3==0 && x[i]%7==0)
				//System.out.println("FizzBuzz");
				fb.add("FizzBuzz");
			else if (x[i]%3==0)
				//System.out.println("Fizz");
				fb.add("Fizz");
			else if (x[i]%7==0)
				//System.out.println("Buzz");
				fb.add("Buzz");
			else {
				//System.out.println(x[i]);
				fb.add(Integer.toString(x[i]));
			}			
		}//end for
		System.out.println(fb);
	}//end main
}//end class
