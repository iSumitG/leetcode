// Solution to 228. Summary Ranges
// Problem: https://leetcode.com/problems/summary-ranges/
// Author: Sumit Gupta

public class Solution {
    public List<String> summaryRanges(int[] nums)
    {
        List<String> a = new ArrayList<String>();
        
        if(nums.length == 0)
            return a;
        
        if(nums.length == 1) {
            a.add(Integer.toString(nums[0]));
            return a;
        }
        
        int start = 0, end = 1;
        while(end < nums.length) {
            if((nums[end] - nums[end-1]) != 1) {
                if(nums[start] == nums[end-1])
                    a.add(Integer.toString(nums[start]));
                else
                    a.add(nums[start] + "->" + nums[end-1]);
                start = end;
            }
            end++;
        }
        
        if(nums[start] == nums[end-1])
             a.add(Integer.toString(nums[start]));
        else
            a.add(nums[start] + "->" + nums[end-1]);
        
        return a;
    }
}
