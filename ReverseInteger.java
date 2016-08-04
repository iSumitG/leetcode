// Solution to 7. Reverse Integer
// Problem: https://leetcode.com/problems/reverse-integer/
// Author: Sumit Gupta

public class Solution {
	public int reverse(int x) {
	    long l=0;
	    
	    while(x != 0) {
	        l = l*10 + x%10;
	        x = x/10;
	    }
	    
	    if (l >= (long)Integer.MIN_VALUE && l <= Integer.MAX_VALUE)
	        return (int) l;
	    else
	        return 0;
	}
}


