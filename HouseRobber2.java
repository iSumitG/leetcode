// Solution to 213. House Robber II
// Problem: https://leetcode.com/problems/house-robber-ii/
// Author: Sumit Gupta

public class Solution {
    
    public int rob(int[] nums, int a, int b)
    {
        int len = b - a + 1;
        
        if(len == 0)
          return 0;
        if(len == 1)
          return nums[a];
        
        if(len == 2)
          return Math.max(nums[a], nums[a+1]);
        
        int[] dp = new int[len];
        dp[0] = nums[a];
        dp[1] = Math.max(nums[a], nums[a+1]);
        
        for(int i=2; i<len; i++)
            dp[i] = Math.max(dp[i-2]+nums[a+i], dp[i-1]);
        
        return dp[len-1];
    }
    
    public int rob(int[] nums) {
        
        if(nums == null || nums.length == 0)
          return 0;
        
        if(nums.length == 1)
          return nums[0];
        
        return Math.max(rob(nums, 0, nums.length-2), rob(nums, 1, nums.length-1));
    }
}     
