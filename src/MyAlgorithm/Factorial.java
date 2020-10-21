package MyAlgorithm;

public class Factorial {

	public static void main(String[] args) {

		
		
		int[] firstarrays = { 5, 5, 0, 5, 2 };
		int[] sceondarrays = { 120, 120, 8, 120, 121 };
		
		for (int i = 0; i < firstarrays.length; i++) {

			int fact = 1;
			
			for (int j = 2; j <= firstarrays[i]; j++) {
				fact = fact * j;
			} // end j

			if (fact == sceondarrays[i]) {
				System.out.println("true");
			} // end if
			else {
				System.out.println("false");
			}

		} // for i

	}

}
