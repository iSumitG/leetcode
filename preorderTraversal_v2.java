// Solution to 144. Binary Tree Preorder Traversal (Recursive)
// Problem: https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        preorderTraversalHelper(root, l);
        return l;
    }
    
    public void preorderTraversalHelper(TreeNode root, List<Integer> l) {
        if(root == null) return;
        
        l.add(root.val);
        preorderTraversalHelper(root.left, l);
        preorderTraversalHelper(root.right, l);
    }
}


