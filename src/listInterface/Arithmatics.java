package listInterface;

public class Arithmatics {
	public void addition(int i, int x){
		int sum = i+x;
		System.out.println("This method calculate additions");
		System.out.println("The Sum is: "+sum);
	}//end of addition
	
	public int substraction(){
		System.out.println("This method calculate substractions (5-2)");
		int a = 5;
		int b = 2;
		int subs = a-b;
		return subs;
		
	}//end of substraction
	
	public void multiplication(){
		System.out.println("This method calculate multiplications");
	}//end of multiplication
	
	public int divistion(int d, int v){
		int div = d/v;
		
		return div;
		//The following statement is not valid for a function
		//System.out.println("This method calculate divisions");
	}//end of division

}
