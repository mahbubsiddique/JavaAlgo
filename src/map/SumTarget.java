package map;

import java.util.HashMap;
import java.util.Map;

public class SumTarget {

	private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(complement);
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
	
	
	public static void main(String[] args) {
		
		int[] nums = {40, 60, 40, 70, 30, 20, 10, -10, 80};
		int newNum[] = findTwoSum(nums, 100);
		
		for(int i=0; i<newNum.length; i++) {
			System.out.println(newNum[i]);
		}
	}

}
