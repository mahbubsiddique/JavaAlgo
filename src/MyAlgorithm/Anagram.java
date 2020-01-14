package MyAlgorithm;

import java.util.Arrays;

public class Anagram {
	
	String s1 = "SAVE";
	String s2 = "VASE";
	
	//return true if two strings are anagram to each other
	//definition of anagram: a word, phrase, or name formed 
	//by rearranging the letters of another, such as cinema, formed from iceman.
	
	public boolean isThisAnagram() {
		
		//first check if those string have same length
		if(s1.length()!=s2.length()) {
			return false;
		}//end if
		
		//convert the first string to an Array of Char
		char s1Array[] = s1.toCharArray();
		Arrays.sort(s1Array);
		
		//convert the second string to an Array of Char
		char s2Array[] = s2.toCharArray();
		Arrays.sort(s2Array);
		
		//compare two array contents
		if (Arrays.equals(s1Array,s2Array)) {
			return true;
		}
		else {
			return false;
		}
		
	}//end of isThisAnagram

	public static void main(String[] args) {
		
		Anagram a = new Anagram();
		boolean isA = a.isThisAnagram();
		//check if the function return 
		if(isA==true) {
			System.out.println("The string "+a.s1+" and "+a.s2+" are Anagram.");
		}else {
			System.out.println("The string "+a.s1+" and "+a.s2+" are not Anagram.");
		}//end of else

	}//end of main

}//end of class
