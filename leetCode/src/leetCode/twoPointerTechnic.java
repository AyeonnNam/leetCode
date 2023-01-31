package leetCode;

public class twoPointerTechnic {

	public static void main(String[] args) {

		// int[] arr = {1, 3, 6, 5, 2, 7, 9}; 9
		// int[] arr = {5,6,7,1};
		int[] arr = { 2, 4, 1, 4, 5, 6, 7, 1, 8, 9, 4, 1 };

		int count = countSubArrSumOfX02(arr, 5);

		System.out.println(count);
	}

	// O(n) => O(n) 성능 향상 하기
	// 2개의 포인터 이용하기

	public static int countSubArrSumOfX02(int[] arr, int x) {
		// int[] arr = {1, 3, 6, 5, 2, 7, 9}; 9
		int count = 0;
		int sum = 0;
		int right = 0;
		int left = 0;
		
		while (right < arr.length) {
			
			if (sum < x) {
				sum += arr[right]; 
				right++; 
			}
			if (sum == x) {

				count++;
				sum -= arr[left];
				left++;
				

			}

			if (sum > x) {
				sum -= arr[left];
				left++;
			}

		}
		return count;

	}

}
