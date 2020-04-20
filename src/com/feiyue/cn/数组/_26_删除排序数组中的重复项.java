package com.feiyue.cn.数组;
/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @author feiyue
 *
 */
public class _26_删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
    	int k = 0;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[k]) {
				nums[++k] = nums[i];
			}
		}
    	
    	return k + 1;

    }

}
