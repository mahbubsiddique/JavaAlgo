package MyAlgorithm;

import java.util.Arrays;

public class ReverseStringByWords {
	
	public static void reverseStringUsingSB() {
		
		String s = "Hello world";
		String[] r = s.split("\\s");
		String reverse = "";

		for (String ss : r) {
			StringBuilder sb = new StringBuilder(ss);
			reverse += sb.reverse().toString() + " ";
		} // end for

		System.out.println(Arrays.toString(r));
		System.out.println(reverse);
		
	}//end of reverseStringUsingSB
	
	public static void reverseStringUsingCharAt() {
		
		String m = "Mahbub Siddique";

		String[] newm = m.split("\\s");
		System.out.println(Arrays.toString(newm));

		for (int i = newm.length - 1; i >= 0; i--) {
			String reverse = "";
			for (int j = newm[i].length() - 1; j >= 0; j--) {
				reverse = reverse + newm[i].charAt(j);
			}//end for i
			System.out.println(reverse);
		}//end for j		
		
	}//end of reverseStringUsingCharAt

	public static void main(String[] args) {
		
		reverseStringUsingSB();
		reverseStringUsingCharAt();
	}//end main

}// end of class
