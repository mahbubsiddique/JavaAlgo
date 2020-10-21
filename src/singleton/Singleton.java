package singleton;

public class Singleton {

	private static Singleton single = null;

	public String s;

	private Singleton() {
		s = "I am a Signleton Class";
	}// end of constructor

	public static Singleton getInstance() {

		if (single == null) {
			single = new Singleton();
		} // end if
		return single;
	}// end getInstance

	public static void main(String[] args) {

	}// end main
}// end class
