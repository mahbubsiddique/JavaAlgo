package stringManipulation;

import java.util.ArrayList;

public class DisplayOddEvenPosition {

	public static void main(String[] args) {
		
		String [] strings = {"Mahbub", "Siddique", "Rana", "Jaber"};
	
	    for(int i = 0; i < strings.length;i++){
	        String word = strings[i];
	        ArrayList<Integer> oddIndexes  = new ArrayList<>();
	        for(int j= 0; j < word.length();j++){
	            if(j % 2 == 0){
	                System.out.print(word.charAt(j));
	            }else{
	                oddIndexes.add(j);
	            }
	        }
	        System.out.print(" ");
	        for(Integer index : oddIndexes){
	            System.out.print(word.charAt(index));
	        }
	        System.out.println();
	    }

	}

}
