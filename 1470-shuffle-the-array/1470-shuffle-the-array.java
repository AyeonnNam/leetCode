class Solution {
    public int[] shuffle(int[] nums, int n) {
        int right = 0;
        int[] arrays = new int[nums.length];
        
        for(int i=0;i< n; i++) {
            arrays[right] = nums[i];
            arrays[right+1] = nums[i+n];
            right +=2;
        }
        return arrays;
        
    }
}