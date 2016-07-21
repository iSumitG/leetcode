// Solution to 54. Spiral Matrix
// Problem: https://leetcode.com/problems/spiral-matrix/
// Author: Sumit Gupta

public class Solution {
    public List <Integer> spiralOrder(int[][] A) {

        List <Integer> l = new ArrayList <Integer> ();

        if (A.length == 0) return l;

        int r1 = 0, r2 = A.length - 1, c1 = 0, c2 = A[0].length - 1;

        while ((r1 <= r2) && (c1 <= c2)) {

            //traverse left to right
            for (int i = c1; i <= c2; i++)
                l.add(A[r1][i]);
            r1++;

            //traverse top to bottom
            for (int i = r1; i <= r2; i++)
                l.add(A[i][c2]);
            c2--;

            //traverse right to left
            for (int i = c2; i >= c1 && r1 <= r2; i--)
                l.add(A[r2][i]);
            r2--;

            //traverse bottom to top
            for (int i = r2; i >= r1 && c1 <= c2; i--)
                l.add(A[i][c1]);
            c1++;
        }

        return l;
    }
}
