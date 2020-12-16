package mapInterface;

public class FindReqWOhash {
	
	//NOT Effective -- use Hashmap solution instead

	public static void main(String[] args) {
		
		String str = "Career Hack is a Hack Career Center located in Astoria New York";
		String []myStr = str.split("\\s");
		String word="";
		int count = 0;
		for(int i=0; i<myStr.length; i++) {
			word = myStr[i];
			count = 1;
			for(int j=i+1; j<myStr.length; j++) {
			if(word.equalsIgnoreCase(myStr[j]))
				count++;
			}
			System.out.println(word+" count: "+count);
		}
		
	}

}
