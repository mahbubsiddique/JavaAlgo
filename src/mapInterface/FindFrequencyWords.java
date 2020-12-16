package mapInterface;

import java.util.HashMap;

public class FindFrequencyWords {

	public static void main(String[] args) {
		
		
		String str = "Career Hack is a Hack Career Center located in Astoria New York";
		String []myStr = str.split("\\s");
		 
	      HashMap<String,Integer> strFreqMap = new HashMap<>();
	      for(int i= 0 ; i< myStr.length ; i++) {
	    	  String word = myStr[i];
	         if(strFreqMap.containsKey(word)) {
	            int count = strFreqMap.get(word);
	            strFreqMap.put(word,count+1);
	         } else {
	        	 strFreqMap.put(word,1);
	         }
	      }
	      System.out.println(strFreqMap);
	   }

}
