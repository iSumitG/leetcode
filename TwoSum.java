// Solution to 1. Two Sum
// Problem: https://leetcode.com/problems/two-sum/
// Author: Sumit Gupta

public class Solution {
	
	public int[] twoSum(int[] array, int target)
	{
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] a = new int[2];
		
		for (int i=0; i<array.length; i++) {
			if(hm.containsKey(array[i])) {
				a[0] = i;
				a[1] = hm.get(array[i]);
				return a;
			}
			else
				hm.put((target - array[i]),i);
		}
		
		return a;
	}
	
}
