package com.feiyue.cn;

public class _203_�Ƴ�����Ԫ�� {
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
			if (head.val != val) {//����������Ԫ������
				newTail.next = head;
				
				
			}
			
			head = head.next;
		}
		
		newTail.next = null;
		return newHead.next;
	}
	

}
