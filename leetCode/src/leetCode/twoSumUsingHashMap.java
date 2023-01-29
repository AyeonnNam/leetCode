package leetCode;

import java.util.HashMap;

public class twoSumUsingHashMap {

	public static int[] twoSumUsingHashMap(int[] nums, int target) {

		HashMap<Integer, Integer> restOfTarget = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (restOfTarget.containsKey(target - nums[i])) {

				return new int[] { restOfTarget.get(target - nums[i]), i };

			} else {
				restOfTarget.put(nums[i], i);
			}

		}

		return new int[2];

	}
	
	

}
