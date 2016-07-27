// Solution to 345. Reverse Vowels of a String
// Problem: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Author: Sumit Gupta

public class Solution {
    
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    
    public String reverseVowels(String s) {
	    if(s == null || s.equals(""))
	        return "";
	    if(s.length() == 1)
	        return s;
		char[] c = s.toCharArray();

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (isVowel(c[start]) && isVowel(c[end])) {
				char temp = c[start];
				c[start] = c[end];
				c[end] = temp;
				start++;
				end--;
			}
			else if (!isVowel(c[start]) && !isVowel(c[end])) {
					start++;
					end--;
			}
			else if (isVowel(c[start])) end--;
		    else start++;
		}

		return new String(c);
	}
}
