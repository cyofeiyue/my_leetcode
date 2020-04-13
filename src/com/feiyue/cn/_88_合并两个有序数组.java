package com.feiyue.cn;

import java.util.Arrays;

public class _88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	// nums1 = [1,3,5,0,0,0], m = 3
    	// nums2 = [2,4,6],       n = 3
    	int i1 = m - 1;
    	int i2 = n - 1;
    	int cur = m + n - 1;
    	
    	while (i2 >= 0) {
    		if (i1 >= 0 && nums2[i2] < nums1[i1]) {
    			nums1[cur--] = nums1[i1--];
    		} else { // i1 < 0 || nums2[i2] >= nums1[i1]
    			nums1[cur--] = nums2[i2--];
    		}
    	}
    }
    
    public static void main(String[] args) {
    	_88_合并两个有序数组 name = new _88_合并两个有序数组();
    	int[] nums1 = {1,2,3,0,0};
    	int[] nums2 = {2,5,6};
    	
    	name.merge(nums1, 3, nums2, 3);
    	
    	for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}

}
