// Solution to 209. Minimum Size Subarray Sum
// Problem: https://leetcode.com/problems/minimum-size-subarray-sum/
// Author: Sumit Gupta

public class Solution {

	public int minSubArrayLen(int s, int[] nums) {
	    if (nums.length == 0 || nums == null)
	      return 0;
	    
	    int i=0, sum = 0, min=Integer.MAX_VALUE;
	    
	    for(int j=0; j<nums.length; j++) {
	        sum = sum + nums[j];
	        while(sum >= s) {
	            min = Math.min(min, (j-i)+1);
	            sum = sum - nums[i];
	            i++;
	        }
	    }
	    return (min == Integer.MAX_VALUE)?0:min;
	}
	
}
