package MyAlgorithm;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "TalenTech";
		String reverse = "";
		
		for(int i = name.length()-1; i>=0; i--) {
			
			reverse = reverse+name.charAt(i);
				
		}//end of for

		System.out.println(reverse);
	}//end of main

}
