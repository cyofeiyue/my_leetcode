package com.feiyue.cn.链表;

import com.feiyue.cn.common.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 * @author feiyue
 *
 */
public class _25_K个一组翻转链表 {
	/** 反转区间 [a, b) 的元素，注意是左闭右开 */
	ListNode reverse(ListNode a, ListNode b) {
	    ListNode pre, cur, nxt;
	    pre = null; cur = a; nxt = a;
	    // while 终止的条件改一下就行了
	    while (cur != b) {
	        nxt = cur.next;
	        cur.next = pre;
	        pre = cur;
	        cur = nxt;
	    }
	    // 返回反转后的头结点
	    return pre;
	}
    public ListNode reverseKGroup(ListNode head, int k) {
    	if (head == null) return head;
    	ListNode a, b;
    	a = b = head;
    	for (int i = 0; i < k; i++) {
			//不足 k 个，不需要反转，base case
    		if (b == null) return head;
    		b = b.next;
		}
    	
    	// 反转前 k 个元素
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
    	return newHead;
    }

}
