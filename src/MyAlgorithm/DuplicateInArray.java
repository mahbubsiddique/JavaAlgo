package MyAlgorithm;

public class DuplicateInArray {

	public static void main(String[] args) {
		// 1, 2, 3, 4, 1 --- duplicate
		//1, 2, 3, 4, 5 --- no duplicate
		
		int[] x = {-1, 2, 0, 0, 4, 5, -1};
		
		boolean isDuplicate = false;
		int dup=-100;
		for(int i=0; i<x.length; i++) {
			int f1=x[i];
			for(int j=i+1; j<x.length; j++ ) {
				int f2 = x[j];
				if(f1==f2) {
					isDuplicate = true;
					dup = f1;
				}
			}//end for j
		}//end for i
		if(isDuplicate==true) 
			System.out.println("Duplicate:"+dup);		
		else
			System.out.println("Not a Duplicate");		
	}

}
