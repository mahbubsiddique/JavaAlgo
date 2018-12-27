package BasicAlgorithms;

public class LinearSearch {
	
	/*
	 * 8. Linear Search
Linear search or sequential search is a method for finding a target value within a list. It sequentially checks each element of the list for the target value until a match is found or until all the elements have been searched.

The logic: Run a loop from 0 till array length searching for the element.
	 * 
	 */
	
	
	public static void Search(int[] a,int num){
		for(int i=0;i<=a.length;i++){
			if(a[i]==num)
				System.out.println("The given number found at index: "+i);
		}
	}

public static void main(String[] args){
	int[] a = {1,12,65,34,8,54,23};
	Search(a,34);
}

}
