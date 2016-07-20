// Solution to 113. Path Sum II
// Problem: https://leetcode.com/problems/path-sum-ii/
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        pathSumHelper(root, sum, temp, result);
        return result;
    }
    
    
    public void pathSumHelper(TreeNode n, int sum, List<Integer> temp, List<List<Integer>> result) {
        if(n == null) return;
        
        temp.add(n.val);
        
        if (n.left == null && n.right == null && sum == n.val)
            result.add(new ArrayList<Integer>(temp));
        else {
            pathSumHelper(n.left, sum - n.val, temp, result);
            pathSumHelper(n.right, sum - n.val, temp, result);
        }
        
        temp.remove(temp.size() - 1);
    }
}
