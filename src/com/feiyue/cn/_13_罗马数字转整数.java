package com.feiyue.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 * 罗马数字由 I,V,X,L,C,D,M 构成；
 * 当小值在大值的左边，则减小值，如 IV=5-1=4；
 * 当小值在大值的右边，则加小值，如 VI=5+1=6；
 * 由上可知，右值永远为正，因此最后一位必然为正。
 * 
 * @author t3
 *
 */

public class _13_罗马数字转整数 {
	private static Map<String, Integer> map = new HashMap<>();

	static {

		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL", 40);
		map.put("L", 50);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("CM", 900);
		map.put("M", 1000);

	}
	
	private int getVal(char ch) {
		switch (ch) {
		case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
		default: return 0;
		}
	}
	
	/**
	 * 罗马数字由 IVXLCDM 构成；
	 * 把一个小值放在大值的左边，就是做减法，
	 * 把一个小值放在大值的右边，就是做加法
	 * @param str
	 * @return
	 */
    public int romanToInt(String s) {
    	int sum = 0;
    	int preNum = getVal(s.charAt(0));
    	
    	for (int i = 1; i < s.length(); i++) {
			int num = getVal(s.charAt(i));
			//当前数字比前任数字 小或相等
			if (num <= preNum) {
				sum += preNum;
			} else {
				sum -= preNum;
			}
			
			preNum = num;
		}
    	
    	sum += preNum;
    	return sum;

    }

	
	public static void main(String[] args) {
		_13_罗马数字转整数 xx = new _13_罗马数字转整数();
		System.out.println(xx.romanToInt("XVI")); //3
		//System.out.println(xx.romanToInt("XXIV"));
		//                               10 10 1 5
	}

}
