package mapInterface;

import java.util.HashMap;

public class FindFrequencyWords {

	public static void main(String[] args) {
		
		
		String str = "Career Hack is a Hack Career Center located in Astoria New York";
		String []myStr = str.split("\\s");
		 
	      HashMap<String,Integer> charFreqMap = new HashMap<>();
	      for(int i= 0 ; i< myStr.length ; i++) {
	    	  String word = myStr[i];
	         if(charFreqMap.containsKey(word)) {
	            int count = charFreqMap.get(word);
	            charFreqMap.put(word,count+1);
	         } else {
	        	 charFreqMap.put(word,1);
	         }
	      }
	      System.out.println(charFreqMap);
	   }

}
