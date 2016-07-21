// Solution to 62. Unique Paths (Using binomial: number of ways to arrange DDD..D (m-1 times) and RRRR..R (n-1 times))
// Problem: https://leetcode.com/problems/unique-paths/
// Author: Sumit Gupta

public class Solution {
    public int uniquePaths(int m, int n) {
         double result = 1;
         
         for(int i=1; i<=(m-1); i++)
             result = result * (n + i - 1)/i;
             
         return (int)result;
     }
}
