package listInterface;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(5);
		x.add(6);
		x.add(8);
		
		System.out.println(x.get(1));
		x.remove(1);
		System.out.println(x.get(1));
		
		for(int i = 0; i<x.size(); i++)
			System.out.println(x.get(i));
	}
}
