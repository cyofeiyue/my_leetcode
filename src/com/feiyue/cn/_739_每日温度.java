package com.feiyue.cn;

import java.util.Stack;

/**
 * 列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
 * 输出应该是                            [1, 1, 4, 2, 1, 1, 0, 0]。
 * 找到右边第一个比自己大的值。
 * https://leetcode-cn.com/problems/daily-temperatures/
 * @author feiyue
 *
 */
public class _739_每日温度 {
    public int[] dailyTemperatures(int[] T) {
    	if (T== null || T.length == 0) return null;
    	
    	int[] result = new int[T.length];
    	Stack<Integer> stack = new Stack<>();
    	for (int i = 0; i < T.length; i++) {
    		while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
				int topIdx = stack.peek();
				result[topIdx] = i - topIdx;
				stack.pop();
			}
    		stack.push(i);
		}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	int[] T = new int[] {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.println(new _739_每日温度().dailyTemperatures(T));
	}
        
}
