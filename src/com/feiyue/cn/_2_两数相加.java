package com.feiyue.cn;

public class _2_两数相加 {
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
	
	/**
	 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
            *输出：7 -> 0 -> 8
            * 原因：342 + 465 = 807
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null ) return l2;
		if (l2 == null ) return l1;
		
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int v1 = (l1 == null) ? 0 : l1.val;
			int v2 = (l2 == null) ? 0 : l2.val;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
			
			int sum = v1 + v2 + carry ;
			carry = sum / 10;
			
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
		}
		if (carry == 1) {
			cur.next = new ListNode(carry);
		}
		
		return dummyHead.next;
	}

	public static void main(String[] args) {

	}

}
