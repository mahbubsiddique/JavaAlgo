package algo;

public class Sum20 {

	public static void main(String[] args) {
		
		int[] x = {5, 13, 15, 17, 9, 16, 4};
		//int [] y = {2, 5, 1, 6, 2, 5, 7, 9, 0};
		
		for(int i=0; i<x.length; i++) {
			int n1 = x[i];
			for(int j=i+1; j<x.length; j++) {
				int n2 = x[j];
				if(n1+n2>=20) {
					System.out.println(n1+ ", "+n2);
				}
			}
			
			
		}
		

	}

}
