package com.feiyue.cn.二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.feiyue.cn.common.TreeNode;

/**
   *  使用栈，时间复杂度O(n)，空间复杂度O(n)
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/submissions/
 * @author feiyue
 *
 */
public class _144_二叉树的前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<>();
    
    	Stack<TreeNode> stack = new Stack<>();
    	
    	if (root != null) stack.push(root);
    	
    	while (!stack.isEmpty()) {
    		TreeNode node = stack.pop();
			result.add(node.val);
			
			if (node.right != null) {
				stack.push(node.right);
			}
			
			if (node.left != null) {
				stack.push(node.left);
			}

		}
    	
    	return result;
    	
    }
    

}
