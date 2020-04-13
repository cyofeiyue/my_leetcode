package com.feiyue.cn.集合;

import java.util.HashSet;

/**
 * TreeSet 基于红黑树，AVL实现，时间复杂度：O(logN)
 * 有序集合：基于搜索树
 * 无需集合：基于链表，性能差于 哈希表
 * 多重集合：允许重复 基于允许重复二分搜索树
 * 
 *例如:
 *输入: words = ["gin", "zen", "gig", "msg"]
 *输出: 2
 * @author t3
 *
 */
public class _804_唯一摩尔斯密码词 {
    public int uniqueMorseRepresentations(String[] words) {
    	String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	
    	HashSet<String> set = new HashSet<>();
    	
    	for (String word : words) {
        	StringBuilder sb = new StringBuilder();
    		for (int i = 0; i < word.length(); i++) {
    			sb.append(codes[word.charAt(i) - 'a']);
			}
    		set.add(sb.toString());
		}
    	return set.size();
    }
    
    public static void main(String[] args) {
    	String[] words = {"gin", "zen", "gig", "msg"};
    	System.out.println(new _804_唯一摩尔斯密码词().uniqueMorseRepresentations(words));
		
	}

}
