// Solution to 9. Palindrome Number
// Problem: https://leetcode.com/problems/palindrome-number/
// Author: Sumit Gupta

public class Solution {
	public boolean isPalindrome(int n) {
        if (n < 0 || (n != 0 && n % 10 == 0)) return false;
        int rev = 0;
        
        while (n > rev) {
        	rev = rev * 10 + n % 10;
    	    n = n / 10;
        }
        
        return (n == rev || n == rev/10);
    }
}
