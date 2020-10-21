package algo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList<Integer> x = new ArrayList<Integer>();
		//int [] x = {18, 7, 8, 90, 5, 12, 33, 87, 98, 4};
		
		List<Integer> x = new ArrayList<Integer>();
		
		x.add(18);
		x.add(7);
		x.add(8);
		x.add(90);
		x.add(5);
		x.add(12);
		
		System.out.println(x.size());
		System.out.println(x.get(3));
		
		for(int i=0; i<x.size(); i++) {
			System.out.println(x.get(i));
		}
		
		
	}

}
