package com.feiyue.cn.高频题;

import java.util.HashMap;
import java.util.Map;

/**
 * _146_LRU缓存机制
 * https://leetcode-cn.com/problems/lru-cache/
 * @author dummy
 *
 */
public class LRUCache {
	private Map<Integer, Node> map;
	private int capacity;
	
	//dummy head
	private Node first;
	private Node last;
	
	
    public LRUCache(int capacity) {
    	map = new HashMap<Integer, LRUCache.Node>(capacity);
    	this.capacity = capacity;
    	first = new Node();
    	last = new Node();
    	first.next = last;
    	last.prev = first;

    }
    
    public int get(int key) {
    	Node node = map.get(key);
    	if (node == null) return -1;
    	removeNode(node);
    	addAfterFirst(node);
    	return node.value;
    	

    }
    
    private void removeNode(Node node) {
    	node.next.prev = node.prev;
    	node.prev.next = node.next;
		
	}
    
    
    private void addAfterFirst(Node node) {
		node.next = first.next;
		first.next.prev = node;
		
		first.next = node;
		node.prev = first;
	}
    
    public void put(int key, int value) {
    	Node node = map.get(key);
    	if (node != null) {
			node.value = value;
			removeNode(node);
			addAfterFirst(node);	
		} else {
			if (map.size() == capacity) {
				removeNode(map.remove(last.prev.key));
			}
			map.put(key, node = new Node(key, value));
			addAfterFirst(node);
		}
    }
    
    
    private static class Node {
    	public int key;
    	public int value;
    	public Node prev;
    	public Node next;
    	
    	public Node(int key, int value) {
    		this.key = key;
    		this.value = value;
    	}
    	
    	public Node() {}
    }
    
    public static void main(String[] args) {
    	LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

    	cache.put(1, 1);
    	cache.put(2, 2);
    	cache.get(1);       // 返回  1
    	cache.put(3, 3);    // 该操作会使得关键字 2 作废
    	cache.get(2);       // 返回 -1 (未找到)
    	cache.put(4, 4);    // 该操作会使得关键字 1 作废
    	cache.get(1);       // 返回 -1 (未找到)
    	cache.get(3);       // 返回  3
    	cache.get(4);       // 返回  4

	}

}
