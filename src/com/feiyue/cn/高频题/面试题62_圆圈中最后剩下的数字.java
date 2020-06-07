package com.feiyue.cn.高频题;

/**
 * 
 * f(n, m) = (f(n-1, m) + m) % n
 * 
 * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 * 
 * @author dummy
 *
 */
public class 面试题62_圆圈中最后剩下的数字 {
	
	//利用公式与递归
    public int lastRemaining1(int n, int m) {
    	if (n == 1) return 0;
    	
    	return (lastRemaining(n - 1, m) + m) % n;
    	
    }
    
    public int lastRemaining(int n, int m) {
    	int res = 0;
    	for (int i = 2; i <= n; i++) {
			res = (res + m) % i;
		}
    	
    	return res;
    	
    }
	

}
