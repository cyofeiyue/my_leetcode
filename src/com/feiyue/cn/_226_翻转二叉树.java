package com.feiyue.cn;

import com.feiyue.cn.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * @author 
 *
 */
public class _226_翻转二叉树{
	
	//递归-前序
	public TreeNode invertTree1(TreeNode root) {
		if (root == null) return root;
		
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		invertTree1(root.left);
		invertTree1(root.right);
		return root;
		
	}
	
	//递归-中序
	public TreeNode invertTree2(TreeNode root) {
		if (root == null) return root;
		
		invertTree2(root.left);
		
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		invertTree2(root.left);
		return root;
		
	}
	
	//递归-后序
	public TreeNode invertTree3(TreeNode root) {
		if (root == null) return root;
		
		invertTree3(root.left);	
		invertTree3(root.right);
		
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		return root;
		
	}

}
