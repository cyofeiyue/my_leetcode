package com.feiyue.cn.数组;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * 
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @author feiyue
 *
 */
public class _283_移动零 {
    public void moveZeroes(int[] nums) {
    	//k代表nums中，[0...k)的元素均为非0元素
    	int k = 0;
    	//遍历到第i个元素后，保证[0...i)中所有非0元素都按照顺序排列在[0...k)中
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				 // 零和非零元素对位交换
				if (i != k) {
					int tmp = nums[i];
					nums[i] = nums[k];
					nums[k] = tmp;
					k++;
				} else {
					k++;
				}
				
			}
		}

    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new _283_移动零().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
	}

}
