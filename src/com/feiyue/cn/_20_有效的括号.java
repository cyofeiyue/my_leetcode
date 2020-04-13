package com.feiyue.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_ÓÐÐ§µÄÀ¨ºÅ {
	
	private static Map<Character, Character> map = new HashMap<>();
	static {
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
	}
//	 public boolean isValid(String s) {
//		 while (s.contains("{}")
//				 || s.contains("[]")
//				 ||s.contains("()")) {
//			 s = s.replace("{}", "");
//			 s = s.replace("[]", "");
//			 s = s.replace("()", "");
//			
//		}
//		 return s.isEmpty();
//	}
	
	public boolean isValid1(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else { //ÓÒÀ¨ºÅ ] } )
				if (stack.isEmpty()) return false;
				char left = stack.pop();
				if (left == '(' && c != ')') return false;
				if (left == '[' && c != ']') return false;
				if (left == '{' && c != '}') return false;
				
			}
			
		}
		
		return stack.isEmpty();
	}
	
	public boolean isValid2(String s) {
		Stack<Character> stack = new Stack<>();
		
		int len = s.length();
		
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				stack.push(c);
			} else { //ÓÒÀ¨ºÅ ] } )
				if (stack.isEmpty()) return false;
				char left = stack.pop();
				
				if (c != map.get(left)) return false;
				
			}
			
		}
		
		return stack.isEmpty();
	}
	
	
	

}
