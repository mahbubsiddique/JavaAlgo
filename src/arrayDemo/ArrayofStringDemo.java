package arrayDemo;

public class ArrayofStringDemo {

	public static void main(String[] args) {
		
		//declare String Array allocating memory
		
		//Declaring array variable and creating array object on the same line
		String [] names = new String[3];
		
		//initialize array
		names[0] = "Nivan";
		names[1] = "Nehan";
		names[2] = "Nora";
		
		System.out.println("Name 1: "+names[0]);
		
		//declare String Array by assigning a list of values
		
		String [] tech = {"cucumber", "testng", "java"};
		
		for(int i=0; i<tech.length;i++) {
			System.out.println("Tech "+i+" :"+tech[i]);
		}
		

	}

}
