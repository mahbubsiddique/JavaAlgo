package MyAlgorithm;

public class FindSmallestAndLargest {

	public static void main(String[] args) {
		
		int [] x = {10, 6, 190, 120, 78};
		
		int smallest = 1000;
		int largest = 0;
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i]>largest)
				largest = x[i];
			else if(x[i]<smallest)
				smallest = x[i];
		}
		
		System.out.println(smallest);
		System.out.println(largest);

	}

}
