package com.feiyue.cn.二叉树;

import com.feiyue.cn.common.TreeNode;import jdk.internal.org.objectweb.asm.tree.analysis.Value;


/**
 * https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
 * 思路：后续遍历
 * 
 * @author dummy
 *
 */
public class _124_二叉树中的最大路径和 {
	
	int sum = Integer.MIN_VALUE;
	
	private int value(TreeNode node) {
		if (node == null) return 0;
		int lv = Math.max(value(node.left), 0);
		int rv = Math.max(value(node.right), 0);
		
		 sum = Math.max(sum, node.val + lv + rv);
		 
		 return node.val + Math.max(lv, rv);
		 
	}
	
    public int maxPathSum(TreeNode root) {
    	value(root);
    	return sum;

    }

}
