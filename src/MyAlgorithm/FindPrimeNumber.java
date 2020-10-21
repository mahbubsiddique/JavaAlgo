package MyAlgorithm;

public class FindPrimeNumber {

	public static void main(String[] args) {

		int number = 11;
		
		boolean isPrime = true;

		for (int i = 2; i < number/2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		} // end for
		
		if (isPrime == true) {
			System.out.println("Its a Prime: "+number);
		}
		else {
			System.out.println("Not a prime number: "+number);
		}
	}// end main

}// end class
