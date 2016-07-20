// Solution to 374. Guess Number Higher or Lower
// Problem: https://leetcode.com/problems/guess-number-higher-or-lower/
// Author: Sumit Gupta

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;
        int mid = i + (j-i)/2;
        
        while(i<j) {
            int g = guess(mid);
            
            if(g == 0) break;
            else if(g == 1)
                i = mid+1;
            else
                j = mid;
            
            mid = i + (j-i)/2;
        }
        return mid;
    }
}
