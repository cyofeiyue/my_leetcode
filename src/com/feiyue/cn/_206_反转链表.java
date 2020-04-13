package com.feiyue.cn;

public class _206_·´×ªÁ´±í {
	/**
	 * Definition for singly-linked list.
	 */
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
    public ListNode reverseList(ListNode head) {
    	if (head == null || head.next == null) return head;
    	
    	ListNode newHead = null;
    	
    	while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
    	
    	return newHead;
    		
    }
	
	

}
