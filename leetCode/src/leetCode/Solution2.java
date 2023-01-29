package leetCode;

class Solution2 {

	public ListNode addtwoNumbers(ListNode l1, ListNode l2) {

		ListNode ret = new ListNode();
		ListNode target = ret;
		int carry = 0;

		while (l1 != null || l2 != null) {

			int val1 = 0;
			int val2 = 0;

			if (l1 != null) {

				val1 = l1.val;

			}
			if (l2 != null) {

				val2 = l2.val;

			}

			int sum = val1 + val2 + carry;

			target.val = sum % 10;

			if (sum >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}

			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}

			if (l1 != null || l2 != null) {

				target.next = new ListNode();
				target = target.next;

			}

		}

		if (carry == 1) {
			target.next = new ListNode(1);
		}
		return ret;

	}

}
