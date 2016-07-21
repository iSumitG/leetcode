// Solution to 62. Unique Paths
// Problem: https://leetcode.com/problems/unique-paths/
// Author: Sumit Gupta

public class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] mat = new int[m][n];
        
        for(int i=0; i < mat.length; i++)
            mat[i][0] = 1;
        
        for(int i=0; i < mat[0].length; i++)
            mat[0][i] = 1;
        
        for(int i=1; i<mat.length; i++)
            for(int j=1; j<mat[0].length; j++)
                mat[i][j] = mat[i][j-1]+mat[i-1][j];
        
        return mat[m-1][n-1];
    }
}
