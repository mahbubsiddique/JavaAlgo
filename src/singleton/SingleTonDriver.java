package singleton;

public class SingleTonDriver {

	public static void main(String[] args) {
		
		Singleton sn1 = Singleton.getInstance(); 
		sn1.s = "First";
		System.out.println(sn1.s);
		
		Singleton sn2 = Singleton.getInstance(); 
		sn2.s = "Second";
		System.out.println(sn2.s);
		
		Singleton sn3 = Singleton.getInstance(); 
		sn3.s = "Third";
		System.out.println(sn3.s);

	}

}
