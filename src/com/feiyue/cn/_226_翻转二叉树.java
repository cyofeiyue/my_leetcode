package com.feiyue.cn;

import com.feiyue.cn.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * @author t3
 *
 */
public class _226_·­×ª¶þ²æÊ÷ {
	
	//µÝ¹é-Ç°Ðò
	public TreeNode invertTree1(TreeNode root) {
		if (root == null) return root;
		
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		invertTree1(root.left);
		invertTree1(root.right);
		return root;
		
	}
	
	//µÝ¹é-ÖÐÐò
	public TreeNode invertTree2(TreeNode root) {
		if (root == null) return root;
		
		invertTree2(root.left);
		
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		invertTree2(root.left);
		return root;
		
	}
	
	//µÝ¹é-ºóÐò
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
