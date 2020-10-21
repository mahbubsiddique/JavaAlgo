package MyAlgorithm;

public class FindALetter {

	public static void main(String[] args) {
		String name = "careerhack";
		char find = 'e';
		int c=0;
		
		for(int i=0; i<=name.length()-1;i++) {
			if(find==name.charAt(i))
				c=c+1;			
		}
		System.out.println("the letter e exists: "+c +" times");

	}

}
