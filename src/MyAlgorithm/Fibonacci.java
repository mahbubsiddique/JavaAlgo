package MyAlgorithm;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= 15; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		} // end for
	}// end for
}// end class
