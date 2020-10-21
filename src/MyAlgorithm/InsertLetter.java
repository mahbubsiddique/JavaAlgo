package MyAlgorithm;

public class InsertLetter {

	public static void main(String[] args) {
		String s = "force";
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
		
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)=='f' || sb.charAt(i)=='F')
				sb.insert(i, 'K');
		}//end for
		String text = sb.toString();
		System.out.println(text);
	}

}
