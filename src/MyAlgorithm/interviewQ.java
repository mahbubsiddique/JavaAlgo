package MyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class interviewQ {
	
	//removing an element from Array
	
	public void removeElement() {
		
		int x[]= {1,2,3,4,5};
		
		int aLen = x.length;
		System.out.println("=========================================");
		System.out.println("Length of Origial Array: "+aLen);
		System.out.println("Original Array x is: "+Arrays.toString(x));
		
		//removing a specific element element
		x = ArrayUtils.removeElement(x, 3);
		int nLen = x.length;
		System.out.println("Length of Updated Array: "+nLen);
		System.out.println("Updated Array x is: "+Arrays.toString(x));
		System.out.println("=========================================");
		
		
	}//end of removeElement
	
	//method that replace duplicate value from an integer array
	public void replaceDuplicate(){
		int x [] = {1,2,2,3,3,4,5,6,7,7,8,9,1};
		
		for(int c=0; c<x.length; c++ ) {	
			for (int i=c+1; i<x.length; i++){
				if (x[c]==x[i]){
					//x[i]=0;
					x = ArrayUtils.remove(x, c);
					System.out.println("Removing: "+x[c]);
				}//end if		
			}//end for
		}//end of for c
		System.out.println(Arrays.toString(x));

	}//end replaceDuplicate
	
	public List<String> fizzBuzz(int[]x){
		String temp=" ";
		//int[] x = {3,5,9,15,16,4,2};
		List<String> fb = new ArrayList<String>();
		for (int i=0;i<x.length; i++){
			if (x[i]%3==0&&x[i]%5==0){
				temp = "FizzBuzz";
				fb.add(temp);
			}//end of if
			else if (x[i]%3==0){
				temp = "Buzz";
				fb.add(temp);
			}// end of else if
			else if (x[i]%5==0){
				temp = "Fizz";	
				fb.add(temp);
			}//end of else if
			else
			{
				temp = Integer.toString(x[i]);
				fb.add(temp);
			}
			//System.out.println(temp);
		}// end of for
		
		//System.out.println(fb);
		return fb;
		
		
	}// end divFiveThree
	
	public void swapWithoutThirdVariable(){
		int a = 5;
		int b = 3;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}//swapWithoutThirdVariable

}
