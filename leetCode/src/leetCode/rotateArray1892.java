package leetCode;

public class rotateArray1892 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		
		int[] rotate = rotate(arr, 2);
		for(int i=0; i<rotate.length; i++) {
			System.out.println(rotate[i] + ", ");
		}
	}
	
	
	public static int[]  rotate(int[]nums, int k) {
		
		k =k % nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums,0,k-1);
        //reverse(nums,k,nums.length-1);
        return nums;
		
	}
	
	
	
	
	public static void swap(int[]nums, int i, int j) {
	
		int temp = nums[i];		
		nums[i] = nums[j];
		nums[j] = temp;	
	}
	
	public static void reverse(int[] nums, int left, int right) {
		
		while(left<right) {
			swap(nums, left, right);
			left++;
			right--;
			
 
		}
		
		
	}
	
	

}
