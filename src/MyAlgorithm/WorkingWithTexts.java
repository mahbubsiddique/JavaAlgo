package MyAlgorithm;

public class WorkingWithTexts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TalenTech offers $80k starting salary";
		System.out.println(str);
		//find index of the symbol $
		System.out.println(str.indexOf("$"));
		//display the value of the character on position 17
		System.out.println(str.charAt(17));
		//display a substring
		System.out.println(str.substring(17));

	}

}
