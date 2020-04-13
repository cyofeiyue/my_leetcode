package com.feiyue.cn;

import com.feiyue.cn.common.ListNode;

/**
 *     ������52. ��������ĵ�һ�������ڵ�
 * @author 123
 *
 */
public class _160_�ཻ���� {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if (headA == null || headB == null) return null;
    	
		ListNode currA = headA;
		ListNode currB = headB;
		
		while (currA != currB) {
			currA = (currA == null) ? headB : currA.next;
			currB = (currB == null) ? headA : currB.next;
		}
		//currBҲ����
		return currA;
    }

}
