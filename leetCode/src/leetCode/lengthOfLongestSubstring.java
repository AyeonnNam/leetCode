package leetCode;

import java.util.HashSet;

class lengthOfLongestSubstring {

	public static void main(String[] args) {

		Solution1 s = new Solution1();
		int maxLength = s.lengthOfLongestSubstring(" ");
		System.out.println(maxLength);

		System.out.println("---------------------------------");
		Solution3 s2 = new Solution3();
		maxLength = s2.lengthOfLongestSubstring(" ");
		System.out.println(maxLength);
	}

}

//해시셋 (HashSet)

/*
 * 데이터의 중복을 허용하지 않는 자료구조로, 중복된 데이터를 제거하거나 이미 데이터가 추가되어 있는지를 검사할 때 주로 사용됩니다. 저장되는
 * 데이터가 해싱되어 나온 해시코드를 인덱스로 활용해 배열(버킷)에 할당하므로, 저장된 데이터의 순서를 파악하는건 불가능합니다.
 */

class Solution1 {

	public int lengthOfLongestSubstring(String s) {

		// abcabcbb
		
		// length = 8

		HashSet<Character> mySet = new HashSet<Character>();
		//position
		int left = 0;
		int right = 0;
		//최대 길이 
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

class Solution3 {

	

	public int lengthOfLongestSubstring(String s) {
		
		String target = "";
		String maxStr = "";
		int pos = 0;
		
		for (int i = 0; i < s.length(); i++) {

			if (target.contains("" + s.charAt(i))) {

				if (maxStr.length() < target.length())
					maxStr = target;
				target = "";
				i = pos++;
			} else {
				target += s.charAt(i);
			}
		}

		if (target.length() > maxStr.length()) {
			maxStr = target;
		}

		return maxStr.length();

	}
}
