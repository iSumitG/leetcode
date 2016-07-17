// Solution to 112. Path Sum
// Problem: https://leetcode.com/problems/path-sum/
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return hasPathSumHelper(root, sum, root.val);
    }
    
    public boolean hasPathSumHelper(TreeNode root, int sum, int tillNow) {
        
        if(root.left == null && root.right == null) //leaf
            if(sum == tillNow) return true;
        
        boolean l = false, r = false;
        
        if(root.left != null)
            l = hasPathSumHelper(root.left, sum, tillNow + root.left.val);
        
        if(root.right != null)
            r = hasPathSumHelper(root.right, sum, tillNow + root.right.val);
        
        return l || r;
    }
}
