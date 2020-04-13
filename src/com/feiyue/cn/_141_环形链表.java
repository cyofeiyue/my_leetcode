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
//		//快慢指针跑步的形式
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
	
	//时间复杂度 O(N/2)即O(N)
	//能不能走三步，可能会错过好几圈。
	//每走一步，两者距离会减少1，相隔N，一次while循环，相隔，n-1
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
