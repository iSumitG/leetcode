// Solution to 69. Sqrt(x)
// Problem: https://leetcode.com/problems/sqrtx/
// Author: Sumit Gupta

public class Solution {
    public int mySqrt(int x) {
        int bit = 1 << 16;
        int ans = 0;
        
        while(bit > 0) {
            ans |= bit;
            if(ans > x/ans)
                ans ^= bit;
            bit >>= 1;
        }
        return ans;
    }
}
