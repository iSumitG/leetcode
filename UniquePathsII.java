// Solution to 63. Unique Paths II
// Problem: https://leetcode.com/problems/unique-paths-ii/
// Author: Sumit Gupta

public class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {

        if (mat[0][0] == 1) return 0;

        int m = mat.length;
        int n = mat[0].length;

        boolean obstacleOnBorders = false;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][0] != 1 && !obstacleOnBorders)
                mat[i][0] = 1;
            else {
                obstacleOnBorders = true;
                mat[i][0] = 0;
            }
        }

        obstacleOnBorders = false;
        for (int i = 1; i < mat[0].length; i++) {
            if (mat[0][i] != 1 && !obstacleOnBorders)
                mat[0][i] = 1;
            else {
                obstacleOnBorders = true;
                mat[0][i] = 0;
            }
        }

        for (int i = 1; i < mat.length; i++)
            for (int j = 1; j < mat[0].length; j++) {
                if (mat[i][j] == 1)
                    mat[i][j] = 0;
                else
                    mat[i][j] = mat[i][j - 1] + mat[i - 1][j];
            }

        return mat[m - 1][n - 1];

    }
}
