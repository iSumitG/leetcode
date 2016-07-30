// Solution to 300. Longest Increasing Subsequence
// Problem: https://leetcode.com/problems/longest-increasing-subsequence/
// Author: Sumit Gupta

public class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length == 1) return 1;
        
        int[] T = new int[nums.length];
        
        Arrays.fill(T, 1);
        
        for(int i=1; i<nums.length; i++)
            for(int j=0; j<i; j++)
                if(nums[j] < nums[i])
                    T[i] = Math.max(T[i], T[j]+1);
        
        int maxlen = 0;
        for(int i=0; i<T.length; i++)
            if(T[i] > maxlen)
                maxlen = T[i];
        
        return maxlen;
    }
}
