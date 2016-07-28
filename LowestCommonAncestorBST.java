// Solution to 235. Lowest Common Ancestor of a Binary Search Tree
// Problem: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(sameSide(root, p, q))
            root = root.val > p.val ? root.left : root.right;
        return root;
    }
    
    private boolean sameSide(TreeNode root, TreeNode p, TreeNode q) {
        return (root.val - p.val) * (root.val - q.val) > 0;
    }
}
