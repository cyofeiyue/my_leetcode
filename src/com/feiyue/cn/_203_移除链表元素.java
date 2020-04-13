package com.feiyue.cn;

public class _203_移除链表元素 {
	/**
	 * Definition for singly-linked list.
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		
		ListNode newHead = new ListNode(0);
		ListNode newTail = newHead;
		
		while (head != null) {
			if (head.val != val) {//符合条件的元素留下
				newTail.next = head;
				
				
			}
			
			head = head.next;
		}
		
		newTail.next = null;
		return newHead.next;
	}
	

}
