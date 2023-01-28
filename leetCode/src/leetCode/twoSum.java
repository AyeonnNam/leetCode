package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class twoSum {

	public static int[] twoSum(int[] nums, int target) {

		// [2,7,6,9] target = 9

		List<Integer> restOfTarget = new ArrayList<Integer>();

		int numSize = nums.length;

		for (int i = 0; i < numSize; i++) {

			int temp = target - nums[i];

			if (restOfTarget.contains(temp)) {

				return new int[] { restOfTarget.indexOf(temp), i };

			} else {
				restOfTarget.add(i, nums[i]);

			}
		}
		return new int[2];

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 3, 4, 4, 1, 9, 0 };

		int[] newArr = twoSum(arr, 8);

		int[] Arr = twoSumUsingHashMap.twoSumUsingHashMap(arr, 8);

		for (int i = 0; i < newArr.length; i++) {

			System.out.println(newArr[i]);

		}
		System.out.println("==============");

		for (int i = 0; i < Arr.length; i++) {

			System.out.println(Arr[i]);

		}

	}

}
