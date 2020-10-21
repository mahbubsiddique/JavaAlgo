package MyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithArrays {
	
	//method to sum the array values
	public void addArray(){	
	System.out.println("This Method Sum Array Values");
	//declaring an Array of numbers
	int numArrays[] = {2,5,3,8,6,9};
	int sum=0;
	for (int i=0; i<numArrays.length; i++){
		sum = numArrays[i]+sum;				
	}//end of for
	System.out.println("Total value of the Array is: "+sum);
	}//end of method -- addArray
	
	//method to reverse an array values
	public void reverseArray(){
		int revArray[] = {8,4,1,9,6};
		//To reverse an Array I need to swap the first number with the last
		//Also the second with the 2nd from last
		//the number of swap is half of the number of elements on a Array
		int arrayLen = revArray.length;
		for(int i=0; i<arrayLen/2;i++){
			int temp = revArray[i];
			revArray[i] = revArray[arrayLen-1-i];
			revArray[arrayLen-1-i] = temp;	
		}//end of for
		//System.out.println("Length of the Array: "+arrayLen);
		System.out.print("The Reverse Array: ");
		for (int x=0; x<revArray.length;x++){
		System.out.print(revArray[x]+" ");
		}
	}//end of reverseArrays
	
	//method to find an Index of an Array value
	public int findIndexArray(){
		System.out.println("This Method Find an Index of an Array Value");
		//declaring an Array of numbers
		int index = -1;
		int numArrays[] = {2,5,3,8,6,9};
		for (int i=0;i<numArrays.length; i++){
			if (numArrays[i]==8){
				index = i;
					//System.out.println(i);
			break;
			}//end of if
		}
		return index;
		
	}//end of method findIndexArray
	
	//method to find an Index of an Array value
	public void sortArray(){
		int sArray[] = {9,3,1,5,2,8};
		int lenArray = sArray.length;
		Arrays.sort(sArray);
		System.out.println();
		System.out.print("The Sorted Array is: ");
		for (int i=0; i<lenArray;i++){
		//Sysout + CTRL + Space
			System.out.print(sArray[i]+" ");
		}//end of for
	}
	//find odd numbers of a certain range and store to Array List
	public void oddEvenNumbers(){
		int range = 10;
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new LinkedList<Integer>();
		for (int i=1;i<=range;i++){
			if (i % 2 !=0){
				odd.add(i);
			}//end if
			else {
				even.add(i);
			}//end else
		}//end for
		int s = odd.size();	
		System.out.println();
		System.out.println("Count:"+s);
		System.out.println("Odd Numbers: "+ odd);
		//display with for loop
		for (int i:even){
			System.out.print("Values:"+i+" ");
		}

	}//end oddEvenNumbers
	
	public void bubbleSort(){
		System.out.println("This method use bubble sort");
	}
	
	//display a string in reverse
	public void reverseString(){
		
		String s = "TalenTech";
		int len = s.length();
		System.out.println("This method reverse a string: "+ s);
		for (int i=len-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		
	}
	
	public void findDuplicate(){
		System.out.println("This method finds duplicate from an array");
	}
	
	//find the minimum number from a multidimensional Array
	//Step 1: Assume the first value of the Array is the minimum number
	//Step 2: Compare the value with the next and capture the minimum
	public void findMinNumber(){
		int mArray[][]={{4,6,2},{7,0,3},{1,3,5}};
		
		int min=mArray[0][0];
		for (int i=0; i<3; i++){
			for(int j=0; j<3;j++){
				if (mArray[i][j]<min) //assuming min number is always lower
						min = mArray[i][j];
			}//end for j
		}//end for i
		System.out.println();
		System.out.println("Minimum Number: "+min);
	}//end of find min number
	
	//find the maximum number of the column of minimum number from a 
	//multidimensional Array
	//Step 1: Find the minimum number
	//Step 2: Identify the minimum number column
	//Step 3: Find the maximum number
	public void findMaxOfMinCol(){
		int mArray[][]={{4,1,8},{5,2,3},{0,8,5}};	
		int min=mArray[0][0];
		int minCol=0;
		for (int i=0; i<3; i++){ //i is row
			for(int j=0; j<3;j++){ //j is column
				if (mArray[i][j]<min){ //assuming min number is always lower
						min = mArray[i][j];
						minCol = j; //capturing the minimum column
				}//end if
			}//end for j
		}//end for i
		int k =0;
		int max=mArray[0][minCol];
		while (k< 3){
			if (mArray[k][minCol]>max){
				
				max = mArray[k][minCol];	
			}//end if
		k++;
		}//end of while k
		System.out.println();
		System.out.println("Column with min number: "+minCol);
		System.out.println("Minimum Number: "+min);
		System.out.println("Max of Minimum Number Col: "+max);
	}//end of find Maximum of minimum number

}//end of class
