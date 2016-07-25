// Solution to 231. Power of Two
// Problem: https://leetcode.com/problems/power-of-two/
// Author: Sumit Gupta

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && ((n & (n-1)) == 0);
    }
}
