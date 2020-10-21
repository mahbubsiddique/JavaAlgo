package MyAlgorithm;

import java.util.Arrays;

public class ReplaceArrayValue {

	public static void main(String[] args) {
	
		String [] names = {"Mahbub", "Sabbir", "Tapan", "Irfan", "Mukta"};
		
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length;i++) {
			if(names[i].equalsIgnoreCase("tapan")) {
				System.out.println("The name found");
				names[i]="Tom";
				break;
			}
			else
				System.out.println("The name is not in the list");
		}
		System.out.println(Arrays.toString(names));		
	}

}
