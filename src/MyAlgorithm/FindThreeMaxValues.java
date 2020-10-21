package MyAlgorithm;

public class FindThreeMaxValues {

	public static void GetThreeMaxValues(int[] nums) {

		int maxOne = 0;
		int maxTwo = 0;
		int maxThree=0;
		for (int n : nums) {
			if (maxOne < n) {
				maxThree=maxTwo;
				maxTwo = maxOne;
				maxOne = n;
			} 
			else if (maxTwo < n) {
				maxThree=maxTwo;
				maxTwo = n;
			}
			else if(maxThree<n)
			{
				maxThree=n;
			}
		}

		System.out.println("Max1 - " + maxOne);
		System.out.println("Max2 - " + maxTwo);
		System.out.println("Max2 - " + maxThree);
	}

	public static void main(String[] args) {
		
		int [] nums = {1,2,31,4,5,6,7,8,9,10,11,12,13};
		
		GetThreeMaxValues(nums);

	}

}
