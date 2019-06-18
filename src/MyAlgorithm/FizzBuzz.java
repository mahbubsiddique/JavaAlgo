package MyAlgorithm;

public class FizzBuzz {

	public static void main(String[] args) {
		
		
		int[] x = {1, 2, 4, 3, 6, 7, 15, 9, 12};
		
		for(int i=0; i<x.length;i++) {
			
			if ((x[i]%3==0)&&(x[i]%5==0))
				System.out.println("FizzBuzz");
			else if (x[i]%3==0)
				System.out.println("Fizz");
			else if (x[i]%5==0)
				System.out.println("Buzz");
			else
				System.out.println(x[i]);
		}

	}

}
