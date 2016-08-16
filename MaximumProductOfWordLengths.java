// Solution to 318. Maximum Product of Word Lengths
// Problem: https://leetcode.com/problems/maximum-product-of-word-lengths/
// Author: Sumit Gupta

public class Solution {
    public int maxProduct(String[] words) {
        if(words == null || words.length == 0) return 0;
        
        if(words.length == 1) return 0;
        
        int[] bitval = new int[words.length];
        
        for(int i=0; i < words.length; i++)
            for(int j=0; j<words[i].length(); j++)
                bitval[i] |= 1 << (words[i].charAt(j) - 'a');
        
        int max = 0;
        for(int i=0; i<words.length; i++)
            for(int j=i+1; j<words.length; j++)
                if((bitval[i] & bitval[j]) == 0)
                    max = Math.max(max, words[i].length() * words[j].length());
        return max;
    }
}

