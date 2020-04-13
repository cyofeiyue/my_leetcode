package com.feiyue.cn;

import java.util.Stack;

public class _150_�沨�����ʽ��ֵ {
	
	public int evalRPN(String[] tokens) {
		Stack<String> s = new Stack<String>();
        for (String str : tokens) {
            if (str.matches("\\d+")) {
                s.push(str);
            } else {
                int b = Integer.parseInt(s.pop());
                int a = Integer.parseInt(s.pop());
                int result=0;
                if (str.equals("+")) {
                    result = a + b;
                } else if (str.equals("-")) {
                    result = a - b;
                } else if (str.equals("*")) {
                    result = a * b;
                } else if (str.equals("/")) {
                    result = a / b;
                } else {
                	throw new RuntimeException("���Ŵ���");
                }
                s.push("" + result);
            }
        }
        //System.out.println(s.peek()); 
        return Integer.parseInt(s.pop());
	}
	
	public static void main(String[] args) {
		
	}

}
