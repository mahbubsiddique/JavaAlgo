package MyAlgorithm;

public class ReturnPrimeTrueFalse {
	
	static boolean isPrime(int x) {
		
		boolean isPrime = true;
		
		for(int i=2; i<x/2; i++) {
			
			if(x%i==0) {
				isPrime = false;
				break;
			}

		}
		return isPrime;
	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(10));

	}

}
