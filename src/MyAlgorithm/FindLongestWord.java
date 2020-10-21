package MyAlgorithm;

import java.util.Arrays;

public class FindLongestWord {

	public static void main(String[] args) {
		String sentence = "The cow jummed over the moon";
		
		String[] s = sentence.split("\\s");
		System.out.println(Arrays.toString(s));
		int len = 0;
		String h="";
		for (int i=0; i<=s.length-1; i++) {
			//System.out.println(s[i]);
			//int len = s[i].length();
			if(s[i].length()>len) {
				len = s[i].length();
				h= s[i];
			}		
		}
		System.out.println(h +" is the largest word with "+len+ " character in length");
		//System.out.println(len);

	}

}
