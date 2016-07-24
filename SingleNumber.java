// Solution to 136. Single Number
// Problem: https://leetcode.com/problems/single-number/
// Author: Sumit Gupta

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for(int i=0; i<nums.length; i++)
            result ^= nums[i];
        
        return result;
    }
}
