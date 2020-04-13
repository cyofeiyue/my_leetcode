package com.feiyue.cn.����;

import java.util.HashSet;

/**
 * TreeSet ���ں������AVLʵ�֣�ʱ�临�Ӷȣ�O(logN)
 * ���򼯺ϣ�����������
 * ���輯�ϣ������������ܲ��� ��ϣ��
 * ���ؼ��ϣ������ظ� ���������ظ�����������
 * 
 *����:
 *����: words = ["gin", "zen", "gig", "msg"]
 *���: 2
 * @author t3
 *
 */
public class _804_ΨһĦ��˹����� {
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
    	System.out.println(new _804_ΨһĦ��˹�����().uniqueMorseRepresentations(words));
		
	}

}
