package MyAlgorithm;

public class FindMinValue {

	public static void main(String[] args) {
		
		//declare integer array assigning list of values
		int [] values = {3, 1, 9, 5, 2, 8};
		
		//int min = 100;
		int min = Integer.MAX_VALUE;
		
		for (int i=0;i<values.length; i++) {
			
			if(values[i]<min)
				min=values[i];
		}
		
		System.out.println("Minimum Value is: "+min);

	}

}
