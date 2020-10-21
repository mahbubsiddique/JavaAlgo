package algo;

public class SwapNoTemp {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 15;
		
		System.out.println("Before swap: "+x+" : "+y);
		
		x=x+y; //x= 25 y 15
		y = x-y; // x = 25 y=10
		x=x-y; //x = 15 y =10
		
		System.out.println("After swap: "+x+" : "+y);
	}

}
