// Solution to 59. Spiral Matrix II
// Problem: https://leetcode.com/problems/spiral-matrix-ii/
// Author: Sumit Gupta

public class Solution {
    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];

        int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1;

        int count = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                result[r1][i] = count;
                count++;
            }
            r1++;

            for (int i = r1; i <= r2; i++) {
                result[i][c2] = count;
                count++;
            }
            c2--;

            for (int i = c2; i >= c1 && r1 <= r2; i--) {
                result[r2][i] = count;
                count++;
            }
            r2--;

            for (int i = r2; i >= r1 && c1 <= c2; i--) {
                result[i][c1] = count;
                count++;
            }
            c1++;
        }
        
        return result;
    }
}
