package listInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		List<String> names = new LinkedList<String>();
		names.add("Tapan");
		names.add("Farah");
		names.add("Raveena");
		names.add("Farah");
		names.add("Abbas");
		
		System.out.println(names);
		
		Iterator<String> i = names.iterator();
		

	}

}
