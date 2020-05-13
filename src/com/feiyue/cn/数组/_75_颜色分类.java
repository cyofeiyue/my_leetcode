package com.feiyue.cn.数组;

/**
 * 套路：扫描一遍数组，一般借助双指针甚至双指针
 * 
 * 红色指针用来扫描数据。
 * 遇到1：跳过，红色指针++
 * 遇到0：跟绿色指针交换值，绿色指针++，红色指针++
 * 遇到2：跟紫色指针交换值，紫色指针--，再次对红色指针进行重复判断
 * https://leetcode-cn.com/problems/sort-colors/
 * @author feiyue
 *
 */
public class _75_颜色分类 {
    public void sortColors(int[] nums) {
    	int i = 0; //红色指针
    	int l = 0; //绿色指针
    	int r = nums.length - 1; //紫色指针
    	//退出循环的条件是：红色指针i > 紫色指针r
    	while (i <= r) {
			int value = nums[i];
			if (value == 0) {
				swapValues(nums, i++, l++);
			} else if (value == 1) {
				i++;
			} else {
				swapValues(nums, i, l--);
			}
		}
    	
    }
    
    private void swapValues(int[] nums, int i, int j) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
}
