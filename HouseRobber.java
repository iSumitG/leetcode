// Solution to 198. House Robber
// Problem: https://leetcode.com/problems/house-robber/
// Author: Sumit Gupta

public class Solution {
    public int rob(int[] nums) {
        int sum1 = 0, sum2 = 0;
        if(nums == null || nums.length == 0)
          return 0;
        if(nums.length == 1)
          return nums[0];
        
        int[] maxTillNow = new int[nums.length];
        maxTillNow[0] = nums[0];
        maxTillNow[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i < nums.length; i++)
            maxTillNow[i] = Math.max(maxTillNow[i-1], maxTillNow[i-2] + nums[i]);
        
        return maxTillNow[nums.length-1];
    }
}
