package MyAlgorithm;

import java.util.Arrays;

public class FindWordCount {

	public static void main(String[] args) {
		String text = "This is my my my dup dup texts";
		
		String[] s = text.split("\\s");
		
		for(int i=0; i<s.length;i++) {
			int count=1;
			for(int j=i+1; j<s.length;j++) {
				if(s[i].equalsIgnoreCase(s[j])) {
					//System.out.println(s[i]);
					count = count+1;	
				}//end if					
			}//end for j
			System.out.println("Total occurances of "+s[i]+" is: "+count);
		}//end for i

	}//end main

}//end class
