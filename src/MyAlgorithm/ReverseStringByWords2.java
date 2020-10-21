package MyAlgorithm;

public class ReverseStringByWords2 {

	public static void main(String[] args) {
		String text = "My Name is Mahbub";

		for (int i = 0; i < text.length(); i++) {
			String reverse = " ";
			if (text.charAt(i) == ' ') {
				for (int j = text.length() - 1; j >= 0; j--) {
					reverse += text.charAt(j);
				} // end for
				System.out.println(reverse);
			} // end if
		} // end for
	}// end main
}// end class
