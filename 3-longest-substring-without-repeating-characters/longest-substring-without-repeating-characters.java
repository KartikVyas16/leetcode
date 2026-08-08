import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> window = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;
        
        while (right < s.length()) {
            if(window.contains(s.charAt(right))) {

                // remove left duplicate element
                window.remove(s.charAt(left));
                left++;
            }
            else {
                // Add current character
                window.add(s.charAt(right));
                // Update maxLength
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }
        return maxLength;
    }
}