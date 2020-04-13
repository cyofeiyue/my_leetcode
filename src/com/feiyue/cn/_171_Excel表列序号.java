package com.feiyue.cn;

/**
 * https://leetcode-cn.com/problems/excel-sheet-column-number/
 * @author t3
 *
 */
public class _171_Excel表列序号 {
//    public int titleToNumber(String s) {
//    	int res = 0;
//    	for (int i = 0; i < s.length(); i++) {
//			res = res*26 + (s.charAt(i) - 'A' + 1);
//		}   	
//    	return res;
//    }
	
	public int titleToNumber(String s) {
		int res = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int tmp = s.charAt(i) - 'A' + 1;
			//26进制
			res = res * 26 + tmp;
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
		_171_Excel表列序号 xx = new _171_Excel表列序号();
		//System.out.println('Z' - 'X');
		System.out.println(xx.titleToNumber("AC"));
		
	}
	

}
