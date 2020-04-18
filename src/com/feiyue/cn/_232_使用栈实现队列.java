package com.feiyue.cn;

import java.util.Stack;

public class _232_使用栈实现队列 {
    /** Initialize your data structure here. */
    public _232_使用栈实现队列() {

    }
    
    Stack<Integer> in = new Stack<>(), out = new Stack<>();
    
    
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	in.push(x);

    }
    
    private void transferEmpty() {
    	if (out.isEmpty()) {
			while (!in.isEmpty()) {
				out.push(in.pop());
			}
		}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	transferEmpty();
    	return out.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	transferEmpty();
    	return out.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return in.isEmpty() && out.isEmpty();
    }
    
    public static void main(String[] args) {
    	_232_使用栈实现队列 myQueue = new _232_使用栈实现队列();
    	myQueue.push(1);
    	myQueue.push(2);
    	myQueue.push(3);
    	
    	//3,2,1
    	System.out.println(myQueue.pop());  //1
    	System.out.println(myQueue.peek()); //2
    	System.out.println(myQueue.empty());
    	System.out.println(myQueue.pop()); //2
    	System.out.println(myQueue.pop()); //3
    	System.out.println(myQueue.empty());
    	
    	
    	
	}
	

}
