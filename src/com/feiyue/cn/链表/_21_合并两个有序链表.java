package com.feiyue.cn.链表;

import com.feiyue.cn.common.ListNode;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author dummy
 *
 */
public class _21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val <= l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }

}
