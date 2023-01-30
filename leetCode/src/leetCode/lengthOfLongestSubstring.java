package leetCode;

import java.util.HashSet;

class lengthOfLongestSubstring {
	
	public static void main(String[] args) {
		
		Solution3 s = new Solution3();
		int maxLength = s.lengthOfLongestSubstring("pwwkew");
		System.out.println(	maxLength);
		
		
	}
	
}

//해시셋 (HashSet)

/*
 * 데이터의 중복을 허용하지 않는 자료구조로, 중복된 데이터를 제거하거나 이미 데이터가 추가되어 있는지를 검사할 때 주로 사용됩니다. 저장되는
 * 데이터가 해싱되어 나온 해시코드를 인덱스로 활용해 배열(버킷)에 할당하므로, 저장된 데이터의 순서를 파악하는건 불가능합니다.
 */

class Solution3 {
	

	public int lengthOfLongestSubstring(String s) {

		// abcabcbb
		// length = 8

		HashSet<Character> mySet = new HashSet<Character>();

		int left = 0;
		int right = 0;
		int max = 0;

		while (right < s.length()) {

			char c = s.charAt(right);

			if (!mySet.contains(c)) {

				mySet.add(c);
				right++;
				max = Math.max(max, mySet.size());

			} else {

				mySet.remove(s.charAt(left));
				left++;
				
			}

		}

		return max;

	}
	
	

}