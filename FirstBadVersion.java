// Solution to 278. First Bad Version
// Problem: https://leetcode.com/problems/first-bad-version/
// Author: Sumit Gupta

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==0 || n==1) return n;
        
        int start = 1;
        int end = n;
        
        while(start<end)
        {
            int mid = (start/2)+(end/2);
            if(isBadVersion(mid))
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return start;
    }
}
