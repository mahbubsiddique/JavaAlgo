package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		
		//A HashSet is a collection of items where every item is unique, 
		//and it is found in the java.util package
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Tapan");
		hs.add("Farah");
		hs.add("Raveena");
		hs.add("Farah");
		hs.add("Abbas");
		
		System.out.println(hs);
		
		//System.out.println(hs.contains("Tapan"));
		
		Iterator i=hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	

	}

}
