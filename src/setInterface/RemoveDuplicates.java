package setInterface;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String [] names = {"Mahbub", "Nupur", "Nora", "Nivan", "Nehan", "Nora"};
		
		HashSet hs = new HashSet<>(Arrays.asList(names));
		
		System.out.println(hs);

	}

}
