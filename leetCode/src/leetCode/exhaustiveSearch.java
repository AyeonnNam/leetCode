package leetCode;

public class exhaustiveSearch {
	
	
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 5, 2, 7, 9};
		//int[] arr = {1, 3, 6};
		System.out.println(countSubArrSumOfX(arr, 9));
		
		
	}
	
	
	//완전탐색 O(n2)
	/* 다음의 배열에서 합이 x인 연속 부분배열의 개수를 구하라 
	 * arr = {1, 3, 6, 5, 2, 7, 9} x = 9    i */
	// * arr = {1, 3, 6, 5, 2, 7, 9} x = 9   j  */
	public static int countSubArrSumOfX(int[] arr, int x) {
		int count = 0; 
		
		for(int i=0; i<arr.length; i++) { // 포인터 역할 
			int sum =0;
			for(int j=i; j<arr.length; j++) { //연산 
				sum +=arr[j];
				if(sum == x) {
					count++;
					break;
					
				}if(sum > x) {
					break;
				}
			}
		}
		
		
		return count;
		
		
	}

}
