class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1; i <= s.length()/2; i++) {
            if(s.length() % i == 0) {
                boolean matches = true;
                for(int j = 0, k = j + i; k < s.length() && matches; j++, k++) {
                    if(s.charAt(j) != s.charAt(k)) { matches = false; }
                }
                if(matches) return true;
            }
        }
        
        return false;
    }
}
