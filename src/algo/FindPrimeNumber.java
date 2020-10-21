package algo;

import java.util.ArrayList;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// prime number - divisible by 1 and the number itself
		//1, 2, 3, 5, 7, 11, 13, 17, 19
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int i=1; i<=100; i++) {
			boolean isPrime = true;
			for(int j=2; j<i/2; j++) {
				if(i%j==0) {	
					isPrime = false;
					break;
				}//end if				
			}//end for j
			if(isPrime==true)
				primes.add(i);	
		}//end for i
		System.out.println(primes);
	}
}
