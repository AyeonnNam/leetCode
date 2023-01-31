package leetCode;

public class twoPointerTechnic {
	
	
	public static void main(String[] args) {
		
		// int[] arr = {1, 3, 6, 5, 2, 7, 9};
		// int[] arr = {5,6,7,1}; 
		int[] arr = {2,4,1,4,5,6,7,1,8,9}; 

		countSubArrSumOfX02(arr, 5);
		
	}
 
		//O(n) => O(n) 성능 향상 하기 
		//2개의 포인터 이용하기 
	
	public static int countSubArrSumOfX02(int[] arr, int x) {
		int count=0;
		int right =0;
		int left =0; 
		for(int i= left; i<arr.length;i++) {
			int sum =+ arr[i];
			if(sum < x) {
				right++;
				sum += arr[right];
			}
			if(sum == x) {
				count++;
				left++;
			}else if(sum > x) {
				sum =0;
				left ++; 
			}
			
		}
		System.out.println(count);
		return count;
		 // * arr = {1, 3, 6, 5, 2, 7, 9} x = 9    i */
			
	}

	
}
