// Solution to 9. Palindrome Number
// Problem: https://leetcode.com/problems/palindrome-number/
// Author: Sumit Gupta

public class Solution {
    public boolean isPalindrome(int n) {
		int temp = n, rev = 0;

		while (temp > 0) {
			rev = 10 * rev + temp % 10;
			temp /= 10;
		}

		return rev == n;
	}
}
