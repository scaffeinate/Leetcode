public class Solution {
    public String longestPalindrome(String s) {
        if(s.isEmpty()) return "";
        
        int max = 1, start = 0, end = 1;
        
        for(int i = 0; i < s.length(); i++) {
            int len = expand(s, i, i);
            if(len > max) {
                max = len;
                start = i - len/2;
                end = i + len/2 + 1;
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            int len = expand(s, i, i+1);
            if(len > max) {
                max = len;
                start = i - len/2 + 1;
                end = i + len/2 + 1;
            }
        }
    
        return s.substring(start, end);
    }
    
    private int expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; right++;
        }
        
        return (right - (left + 1));
    }
}
