package com.feiyue.cn;

import com.feiyue.cn.common.ListNode;

/**
 *     面试题52. 两个链表的第一个公共节点
 * @author 123
 *
 */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if (headA == null || headB == null) return null;
    	
		ListNode currA = headA;
		ListNode currB = headB;
		
		while (currA != currB) {
			currA = (currA == null) ? headB : currA.next;
			currB = (currB == null) ? headA : currB.next;
		}
		//currB也可以
		return currA;
    }

}
