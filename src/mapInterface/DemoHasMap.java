package mapInterface;

import java.util.HashMap;

public class DemoHasMap {

	public static void main(String[] args) {
		
		//A HashMap however, store items in "key/value" pairs, 
		//and you can access them by an index of another type
		//HashMap doesn't allow duplicate keys but allows duplicate values.
				
		//declare a hashmap
		HashMap<String, String> map = new HashMap<>();
		
		//add value to a hashmap
		map.put("Bangladesh", "Dhaka");
		map.put("USA", "DC");
		map.put("UK", "London");
		
		//access data individually -- and display
		System.out.println(map.get("USA"));
		System.out.println(map.get("Bangladesh"));
		//display entire map contents
		System.out.println(map);
		
		//find hasmap size
		int l = map.size();
		System.out.println("Size of the map: "+l);
		
		//loop through the hashmap - print key
		for(String i: map.keySet()) {
			System.out.println(i);
		}
		
		//loop through the hashmap - print values
		for(String i: map.values()) {
			System.out.println(i);
		}
		//loop through the hashmap - print key & values
		for(String i: map.keySet()) {
			System.out.println(i+": "+map.get(i));
		}
		
		//remove an item
		map.remove("UK");
		System.out.println(map);
		
		//remove all item
		map.clear();
		System.out.println(map);
	}

}
