package leetCode;

import java.util.HashMap;

public class twoSumUsingHashMap {

	
	
public static int[] twoSumUsingHashMap(int[] nums, int target) {
		
		
		HashMap<Integer, Integer> restOfTarget = new HashMap<Integer, Integer>();
		
		int numSize = nums.length;
		
		for(int i=0; i< numSize; i++) {
			
			int temp = target - nums[i];
			
			if(restOfTarget.containsKey(temp)) {
				return new int[] { restOfTarget.get(temp), i };
				
			}else  {
				restOfTarget.put( target-temp, i );
			}
			
		}
		
		
		
		return new int[2];
				
	}
		
}
