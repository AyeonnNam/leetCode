package leetCode;

public class rotateArray {

	public static void main(String[] args) {
		
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr1 = { -1, -100, 3, 99 };
		int[] rotate = rotate(arr1, 2);
		for (int i = 0; i < rotate.length; i++) {
			System.out.print(rotate[i] + ", ");
		}

	}

	public static int[] rotate(int[] nums, int k) {
		 // 8%6 k = 2 ///6
		k = k%nums.length;
		 
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		
		return nums;
	}

	/*							// 	
	 * Example 1: k = 3 Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
	 * Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to
	 * the right:[6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
	 * Example 2:
	 * 
	 * Input: nums = [-1,-100,3,99], k = 2 Output: [3,99,-1,-100] Explanation:
	 * rotate 1 steps to the right: [99,-1,-100,3] rotate 2 steps to the right:
	 * [3,99,-1,-100]
	 */
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static int[] reverse(int[] nums, int left, int right) {

		while (left < right) {
			swap(nums, left, right);
			left++;
			right--;
		}

		return nums;

	}

}
