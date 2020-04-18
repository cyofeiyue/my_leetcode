package com.feiyue.cn;

public class _141_环形链表 {

	/**
	 * Definition for singly-linked list.
	 */
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

//	public boolean hasCycle(ListNode head) {
//		if (head == null || head.next == null) return false;
//		
//		ListNode slow = head.next;
//		ListNode fast = head.next.next;
//		
//		while (fast != null && fast.next != null) {
//	        slow = slow.next;
//	        fast = fast.next.next;
//			if (slow == fast) return true;

//		}
//		
//		return false;
//	}
	
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) return false;
		
		ListNode slow = head.next;
		ListNode fast = head.next.next;
		while (fast != slow) {
			if (fast == null || fast.next == null) return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return true;
	}

}
