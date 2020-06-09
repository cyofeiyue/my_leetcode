package com.feiyue.cn.链表;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.feiyue.cn.common.ListNode;
import com.sun.corba.se.impl.orbutil.graph.Node;

/**
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/
 * 
 * @author dummy
 *
 */
public class _23_合并K个排序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
    	if (lists == null || lists.length == 0) return null;
    	
    	Comparator<ListNode> comparator = new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				
				return o1.val - o2.val;
			}
    		
		};
    	
		//dummy head
		ListNode head = new ListNode(0);
		ListNode cur = head;
		
    	//最小堆，优先级队列
    	PriorityQueue<ListNode> queue = new PriorityQueue<>(comparator);
    	

    	for (ListNode list : lists) {
    		if (list == null) continue;
    		queue.offer(list);
		}
    	
    	while (!queue.isEmpty()) {
			ListNode node = queue.poll();
			cur = cur.next = node;
			if (node.next != null) {
				queue.offer(node.next);
			}
		}
    	
    	
		return head.next;

    }

}
