package algo;

public class Palindrome {

	public static void main(String[] args) {
		//madam
		//mom
		
		String name = "doorbell";
		
		String reverse = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse+name.charAt(i);
		}
		
		if(name.equalsIgnoreCase(reverse))
			System.out.println(name+" is a palindrome");
		else
			System.out.println(name+" is a NOT palindrome");
	}
}
