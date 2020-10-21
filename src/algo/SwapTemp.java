package algo;

public class SwapTemp {

	public static void main(String[] args) {
		
		int x= 10;
		int y= 15;
		int temp;
		System.out.println("Before swap: "+x+" : "+y);
		temp=x;
		x=15;
		y=temp;
		System.out.println("After swap: "+x+" : "+y);

	}

}
