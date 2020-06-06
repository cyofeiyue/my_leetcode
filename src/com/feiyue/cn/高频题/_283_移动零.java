package com.feiyue.cn.高频题;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * https://leetcode-cn.com/problems/move-zeroes/
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @author dummy
 *
 */
public class _283_移动零 {
    public void moveZeroes(int[] nums) {
    	if (nums == null) return;
    	
    	for (int i = 0, cur = 0; i < nums.length; i++) {
    		//如果是0，跳过
    		if (nums[i] == 0) continue;
    		if (cur != i) {//corner case 如果nums[]里面只有一个数
    			//不用做swap，操作，下面这样更便捷。
				nums[cur] = nums[i];
				nums[i] = 0;
			}
    		cur++;
    		
    		System.out.println("cur:" + cur + " i:" + i);
			
		}

    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new _283_移动零().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
	}

}
