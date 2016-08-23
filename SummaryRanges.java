// Solution to 231. Power of Two
// Problem: https://leetcode.com/problems/power-of-two/
// Author: Sumit Gupta

public class Solution {
    public List<String> summaryRanges(int[] nums)
    {
        ArrayList<String> a = new ArrayList<String>();
        
        //Set<Integer> ts = TreeSet<Integer>();
        if(nums.length == 0) return a;
        if(nums.length == 1)
        {
            a.add(Integer.toString(nums[0]));
            return a;
        }
        
        int start = 0;
        int end = 1;
        while(end<nums.length)
        {
            if((nums[end] - nums[end-1]) != 1)
            {
                if(nums[start] == nums[end-1])
                {
                    a.add(Integer.toString(nums[start]));
                }
                else
                {
                    String s = nums[start] + "->" + nums[end-1];
                    a.add(s);
                }
                
                start=end;
                end++;
            }
            else
            {
                end++;
            }
        }
        
        if(nums[start] == nums[end-1])
        {
             a.add(Integer.toString(nums[start]));
        }
        else
        {
            String s = nums[start] + "->" + nums[end-1];
            a.add(s);
        }
        
        return a;
        
    }
}
