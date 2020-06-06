package com.feiyue.cn.高频题;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 时间复杂度：o(n),空间复杂度：o(n)
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9,所以返回 [0, 1]
 * @author dummy
 *
 */
public class _1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
    	if (nums == null) return null;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
			Integer idx = map.get(target - nums[i]);
			if (idx != null) {
				return new int[] {idx, i};
			}
			map.put(nums[i], i);
			
		}
    	
    	return null;
    	
    	//return new int[] {-1, -1};
        
    }

}
