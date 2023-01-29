package leetCode;

class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}

class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode();
		ListNode target = result;
		
		int carry = 0;
		
		while(l1 != null || l2 !=null) {
			
			
			int val1 = 0;
			int val2 = 0;
			
			
			
			if(l1 != null) {val1 = l1.val;}
			if(l2 != null) {val2 = l2.val;}
	
			
			int sum = (val1 + val2 + carry);
			
			target.val = sum%10;
			
			if(sum>=10) {
				carry = 1;
			}else {carry =0;}
			
			
			if(l1 != null ) {
				l1 = l1.next;
			}
			
			if(l2 != null) {
				l2 = l2.next;
			}
			
			if(l1 !=null || l2 != null ) {
				
				target.next = new ListNode();
				target = target.next;
				
			}
				
			}
		
		if (carry == 1) {
			target.next = new ListNode(1);
		}
			
		return result;
		}
		

}

public class addTwoNumbers {

	public static void main(String[] args) {

		ListNode m1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode m2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		Solution s = new Solution();
		ListNode r = s.addTwoNumbers(m1, m2);
		System.out.println(r.val);
		r = r.next;
		System.out.println(r.val);
		r = r.next;
		System.out.println(r.val);
		

	}

}
