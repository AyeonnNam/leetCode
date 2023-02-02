class Solution {
    public int arrayPairSum(int[] nums) {
        

        Arrays.sort(nums);

		int sumMax = 0;

		for (int i = 0; i < nums.length; i += 2) {

			sumMax += nums[i];
		}

            return sumMax;
    }
}