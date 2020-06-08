package com.feiyue.cn.二叉树;

import com.feiyue.cn.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * 思路：
 * 中序遍历，相当于升序排列
 * @author dummy
 *
 
 */
public class _98_验证二叉搜索树 {
	
	Integer last; //默认为null
	
    public boolean isValidBST(TreeNode root) {
    	if (root == null) return true;
    	
    	isValidBST(root.left);
    	
    	//上一次的值 >= 本次的值，那么不是升序， 两者相等也不算。
    	if (last != null && last >= root.val) return false;
    	
    	last = root.val;
    	
    	isValidBST(root.right);
    	
    	return true;

    }

}
