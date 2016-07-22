// Solution to 131. Palindrome Partitioning
// Problem: https://leetcode.com/problems/palindrome-partitioning/
// Author: Sumit Gupta

public class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList <List<String>> ();
        if (s == null) return result;
        List<String> temp = new ArrayList<String>();

        populateLists(s, 0, temp, result);
        return result;
    }

    private void populateLists(String s, int position, List<String> temp, List<List<String>> result) {

        if (position == s.length())
            result.add(new ArrayList<String>(temp));
        else {
            for (int i = position; i < s.length(); i++) {
                String s1 = s.substring(position, i + 1);
                if (isPalindrome(s1)) {
                    temp.add(s1);
                    populateLists(s, i + 1, temp, result);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

}
