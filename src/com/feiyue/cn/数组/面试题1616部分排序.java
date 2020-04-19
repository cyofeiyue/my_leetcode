package com.feiyue.cn.数组;

/**
 * 对某个数组中某段数组【m,n】进行排序，可达成整个数组有序。
 * 解题思路：左边->右边，寻找最右边的逆序对，小的数
 *       从右边->左边，寻找最左边的逆序对，大的数
 *       
 * 1,5,4,3,2,6,7,2,8
 * 
 * @author feiyue
 *
 */
public class 面试题1616部分排序 {
    public int[] subSort(int[] nums) {
    	if (nums.length == 0) return new int[] {-1, -1};
    	//扫描过的最大值：8  不停更新，
    	//如果发现当前值 < 最大值，记录该值的位置 7
    	
    	//扫描过的数组中的最大值
    	int max = nums[0];
    	//记录最右边逆序对位置
    	int r = -1;

    	for (int i = 1; i < nums.length; i++) {
			int v = nums[i];
			if (v >= max) {
				max = v;
			} else {
				r = i;//记录逆序对位置
			}
		}
    	
    	//提前结束
    	if (r == -1) return new int[] {-1, -1};
    	
    	//记录最左边逆序对位置
    	int l = -1;
    	int min = nums[nums.length - 1];
    	//从右边到左边开始遍历
    	for (int i = nums.length - 2; i >= 0; i--) {
    		int v = nums[i];
    		if (v <= min) {
				min = v;
			} else {
				l = i;
			}
			
		}
    	
    	//扫描过的最小值：  1 不停更新，
    	//如果发现当前值 > 最小值，记录该值的位置  5
    	return new int[] {r, l};
    }

}
