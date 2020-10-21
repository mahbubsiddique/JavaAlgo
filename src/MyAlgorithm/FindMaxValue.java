package MyAlgorithm;

public class FindMaxValue {

	public static void main(String[] args) {
		
		//declare integer array assigning list of values
		int [] values = {3, 1, 9, 5, 2, 8};
		
		//int max =0;
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<values.length; i++) {
			
			if (values[i]>max)
				max = values[i];
		}
		
		System.out.println("Max Value is: "+max);

	}

}
