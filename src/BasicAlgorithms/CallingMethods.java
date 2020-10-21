package BasicAlgorithms;

import MyAlgorithm.WorkingWithArrays;
import listInterface.Arithmatics;

public class CallingMethods {

	public static void main(String[] args) {
		//Creating Object a of Arithmetics Class
		Arithmatics a = new Arithmatics();
		//invoking addition methods from a different class Arithmetics
		a.addition(5,3);
		
		//Creating Object s of Arithmetics Class
		Arithmatics s = new Arithmatics();
		//invoking addition methods from a different class Arithmetics
		System.out.println("The return Result is: "+s.substraction());
		
		//Creating Object m of Arithmetics Class
		Arithmatics m = new Arithmatics();
		//invoking addition methods from a different class Arithmetics
		m.multiplication();
		
		//Creating Object d of Arithmetics Class
		Arithmatics d = new Arithmatics();
		//invoking addition methods from a different class Arithmetics
		System.out.println("The Divison return:"+d.divistion(12,3));
		
		/***************************************************************/
		//Creating Object d of WorkingWithArrays Class
		WorkingWithArrays sum = new WorkingWithArrays();
		//display the sum of the arrays
		sum.addArray();
		
		//Creating Object i of WorkingWithArrays Class
		WorkingWithArrays i = new WorkingWithArrays();
		//display the index of the array value 8
		System.out.println("The index of Value 8 is: "+i.findIndexArray());
		
		//Creating Object r for reverse array
		WorkingWithArrays r = new WorkingWithArrays();
		r.reverseArray();
		
		//Creating Object so for sorting an Array
		WorkingWithArrays so = new WorkingWithArrays();
		so.sortArray();
		
		//Creating Object so for sorting an Array
		WorkingWithArrays o = new WorkingWithArrays();
		o.oddEvenNumbers();
		
		//Calling finding minimum number on an Array
		o.findMinNumber();
		o.findMaxOfMinCol();
		o.reverseString();

	}

}
