// Solution to 69. Sqrt(x)
// Problem: https://leetcode.com/problems/sqrtx/
// Author: Sumit Gupta

public class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        
        int left = 0, right = x;
        
        while(left < right) {
            int mid = left + (right-left)/2;
            
            if(mid == x/mid)
                return mid;
            
            if(mid < x/mid) {
                if(mid+1 > x/(mid+1))
                    return mid;
                left = mid+1;
            }
            else
                right = mid-1;
        }
        
        return left;
    }
}
