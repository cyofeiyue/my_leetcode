package com.feiyue.cn.栈与队列;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack/
 * @author feiyue
 *
 */
public class _155_最小栈 {
	Stack<Integer> stack;
	Stack<Integer> minStack;
    /** initialize your data structure here. */
    public _155_最小栈() {
    	stack = new Stack<>();
    	minStack = new Stack<>();
    }
    
    public void push(int x) {
    	if (minStack.isEmpty()) {
			minStack.push(x);
		}
    	if (!minStack.isEmpty()) {
			minStack.push(Math.min(x, minStack.peek()));
		}
    	
    	stack.push(x);

    }
    
    public void pop() {
    	stack.pop();
    	minStack.pop();

    }
    
    public int top() {
    	return stack.peek();

    }
    
    public int getMin() {
    	return minStack.peek();

    }
    
    public static void main(String[] args) {
    	_155_最小栈  minStack = new _155_最小栈();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	System.out.println(minStack.getMin());  // --> 返回 -3.
    	minStack.pop();
    	System.out.println(minStack.top());      //--> 返回 0.
    	System.out.println(minStack.getMin());   //--> 返回 -2.

	}

}
