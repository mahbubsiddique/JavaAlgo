package algo;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 .....
		int n1=0;
		int n2=1;
		int n3;
		List<Integer> fibo = new ArrayList<Integer>();
		fibo.add(n1);
		fibo.add(n2);
		//System.out.println(n1);
		//System.out.println(n2);
		
		for(int i=2; i<=10; i++) {
			n3=n1+n2;
			fibo.add(n3);
			//System.out.println(n3);
			n1=n2;
			n2=n3;
		}//end for		
		System.out.println(fibo);
	}
}
