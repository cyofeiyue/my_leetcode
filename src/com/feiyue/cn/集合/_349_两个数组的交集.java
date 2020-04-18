package com.feiyue.cn.集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * 
 * TreeSet、TreeMap基于平衡二叉树的实现，时间复杂度 O(logN)
 * HashSet、HashMap基于哈希表的实现
 * 对外接口相同
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @author 
 *
 */
public class _349_两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
    	TreeSet<Integer> set = new TreeSet<>();
    	
    	//nums1放进去重集合
    	for (int num : nums1) {
    		set.add(num);
		}
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	//nums2放进去重集合
    	for (int num : nums2) {
			if (set.contains(num)) {
				list.add(num);
				set.remove(num);
			}
		}
    	
    	int[] ints = new int[list.size()];
    	
    	for (int i = 0; i < list.size(); i++) {
			ints[i] = list.get(i);
		}
    	return ints;

    }
    
    public static void main(String[] args) {
        int[] nums1 = new int[]{9,4,9,8,4};
        int[] nums2 = new int[] {4,9,5,4,4,9};
        
        int[] ints = new _349_两个数组的交集().intersection(nums1, nums2);
        System.out.println(Arrays.toString(ints));
	}
	
}
