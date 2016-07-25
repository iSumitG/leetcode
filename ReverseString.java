// Solution to 344. Reverse String
// Problem: https://leetcode.com/problems/reverse-string/
// Author: Sumit Gupta

public class Solution {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
