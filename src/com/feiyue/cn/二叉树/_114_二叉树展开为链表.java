package com.feiyue.cn.二叉树;

import com.feiyue.cn.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * 思路：前序遍历的
 * 
 * @author dummy
 *
 */
public class _114_二叉树展开为链表 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        
        TreeNode mostRigth = root;
        TreeNode oldRight = root.right;
        
        flatten(root.left);
        
        root.right = root.left;
        root.left = null;
        
        while(mostRigth.right != null) {
        	mostRigth = mostRigth.right;
        }
        
        mostRigth.right = oldRight;
        
        flatten(root.right);
    }

}
