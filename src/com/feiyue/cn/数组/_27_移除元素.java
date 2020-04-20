package com.feiyue.cn.数组;
/**
 * https://leetcode-cn.com/problems/remove-element/
 * @author feiyue
 *
 */
public class _27_移除元素 {
    public int removeElement(int[] nums, int val) {
    	int k = 0;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != val) {
				nums[k++] = nums[i];
			}
			
		}
    	
    	return k;
    }
    
    public static void main(String[] args) {
    	int[] nums = {3, 2 ,2, 3, 6};
		System.out.println(new _27_移除元素().removeElement(nums, 2));
	}

}
