// Solution to 290. Word Pattern
// Problem: https://leetcode.com/problems/word-pattern/
// Author: Sumit Gupta

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        if(pattern == null || str == null)
            return false;
        
        String[] strArray = str.split(" ");
        
        if(pattern.length() != strArray.length)
            return false;
        
        Map<Character, String> hm = new HashMap<Character, String>();
        
        for(int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(hm.containsKey(c)) {
                if(!hm.get(c).equals(strArray[i]))
                    return false;
            }
            else {
                if(hm.containsValue(strArray[i]))
                    return false;
                hm.put(c, strArray[i]);
            }
        }
        
        return true;
    }
}

