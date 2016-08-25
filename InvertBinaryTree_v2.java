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
          return root;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode consider = q.poll();
            TreeNode temp = consider.left;
            consider.left = consider.right;
            consider.right = temp;
            
            if(consider.left != null)
              q.add(consider.left);
            if(consider.right != null)
              q.add(consider.right);
        }
        
        return root;
    }
}
