// Solution to 343. Integer Break
// Problem: https://leetcode.com/problems/integer-break/
// Author: Sumit Gupta

public class Solution {
    public int integerBreak(int n) {
        if(n == 2 || n == 3) return n-1;
        
        int pro = 1;
        while(n>4) {
            n -= 3;
            pro *= 3;
        }
        
        pro *= n;
        return pro;
    }
}
