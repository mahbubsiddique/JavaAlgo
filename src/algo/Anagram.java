package algo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// SAVE --- AESV
		// VASE --- AESV
		
		String s1 = "SAVE";
		String s2 = "VASR";
		
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		
		System.out.println(Arrays.toString(s1Array));
		System.out.println(Arrays.toString(s2Array));
		
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		System.out.println(Arrays.toString(s1Array));
		System.out.println(Arrays.toString(s2Array));
		
		if(Arrays.equals(s1Array, s2Array))
			System.out.println("It is an Anagram");
		else
			System.out.println("It is NOT an Anagram");

	}
}
