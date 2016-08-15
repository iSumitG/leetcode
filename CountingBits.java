// Solution to 338. Counting Bits
// Problem: https://leetcode.com/problems/counting-bits/
// Author: Sumit Gupta

public class Solution {
    public int[] countBits(int num) {
        int[] a = new int[num+1];
        for(int i=0; i<=num; i++)
            a[i] = (i%2 == 0) ? a[i/2] : a[i/2]+1;
        return a;
    }
}

