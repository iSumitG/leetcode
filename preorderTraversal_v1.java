// Solution to 144. Binary Tree Preorder Traversal (Iterative)
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
        
        if(root == null) return l;
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        
        while(!st.isEmpty()) {
            TreeNode temp = st.pop();
            l.add(temp.val);
            
            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        }
        
        return l;
    }
}


