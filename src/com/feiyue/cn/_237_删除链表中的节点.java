package com.feiyue.cn;

public class _237_ɾ�������еĽڵ� {

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

	public void deleteNode(ListNode node) {
		node.val = node.next.val; 
		node.next = node.next.next;
		
	}

	public static void main(String[] args) {

	}

}
