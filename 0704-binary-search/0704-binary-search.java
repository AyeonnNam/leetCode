class Solution {
    public int search(int[] nums, int target) {
       int right =nums.length-1;
	    	int left =0;
	    	
	    	
	    	      while(left <= right ) {
	    	    	  int mid = (int)(right+left)/2;
	    	    	  
	    	    	  if(nums[mid] < target) {
	    	    		  left = mid+1;
	    	    	  }
	    	    	  
	    	    	  
	    	    	  else if(nums[mid] > target) {
	    	    		  right  = mid-1;
	    	    	  }
	    	    	  
	    	    	  else if(nums[mid] == target) {
	    	    		  return mid;
	    	    	  }
	    	    	 
	    	    	  }
	    	       return -1;
	    	      
	    }
}