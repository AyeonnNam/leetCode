class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length * 2;
        int[] res = new int[n];
       int mid = res.length/2; // 
      
       System.arraycopy(nums,0,res,0,nums.length);
       System.arraycopy(nums,0,res,mid,nums.length);
        
        return res;
        
    }
}