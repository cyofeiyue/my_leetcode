package com.feiyue.cn.����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @author t3
 *
 */
public class _350_��������Ľ���II {
	
    public int[] intersect(int[] nums1, int[] nums2) {
    	//ӳ��<Ԫ�أ� ����Ƶ��>
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums1) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.put(num, map.get(num) - 1);

                if (map.get(num) == 0) {
                    map.remove(num);
                }
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
        
        int[] ints = new _350_��������Ľ���II().intersect(nums1, nums2);
        System.out.println(Arrays.toString(ints));
	}

}
