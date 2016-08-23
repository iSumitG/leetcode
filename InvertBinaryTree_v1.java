// Solution to 226. Invert Binary Tree
// Problem: https://leetcode.com/problems/invert-binary-tree/
// Author: Sumit Gupta

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return null;
        
        TreeNode newRoot = new TreeNode(root.val);
        
        if(root.right != null)
            newRoot.left = invertTree(root.right);
        if(root.left != null)
            newRoot.right = invertTree(root.left);
        
        return newRoot;
    }
}
