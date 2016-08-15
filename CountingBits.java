// Solution to 338. Counting Bits
// Problem: https://leetcode.com/problems/counting-bits/
// Author: Sumit Gupta

public class Solution {
    public int[] countBits(int num) {
        int[] a = new int[num+1];
        for(int i=0; i<=num; i++) {
            if(i%2 == 0) //even
                a[i] = a[i/2];
            else //odd
                a[i] = a[i/2] + 1;
        }
        return a;
    }
}

