package com.feiyue.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_两数之和 {

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2) {
			return new int[] {-1, -1};
		}
		
		Map<Integer, Integer> map = new HashMap();
//		int[] result = new int[] {-1, -1};
//		for (int i = 0; i < nums.length; i++) {
//			int diffValue = target - nums[i]; // 13 -2 = 11
//			if (map.containsKey(diffValue)) {
//				result[0] = map.get(diffValue);
//				result[1] = i;
//				break;
//			}
//			
//			map.put(nums[i], i);
//		}
//		
//		return result;
		
		for (int i = 0; i < nums.length; i++) {
			int diffValue = target - nums[i];
			if (map.containsKey(diffValue)) {
				return new int[] {map.get(diffValue), i};
			}
			map.put(nums[i], i);
			
		}
		
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		int[] ints = new int[] {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(ints, 13)));
	}

}
