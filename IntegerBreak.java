// Solution to 343. Integer Break
// Problem: https://leetcode.com/problems/integer-break/
// Author: Sumit Gupta

public class Solution {
    public int integerBreak(int n) {
        
        if(n == 2) return 1;
        if(n == 3) return 2;
        
        int pro = 1;
        
        while(n>4)
        {
            n = n-3;
            pro = pro*3;
        }
        
        pro = pro * n;
        
        return pro;
    }
    
}
