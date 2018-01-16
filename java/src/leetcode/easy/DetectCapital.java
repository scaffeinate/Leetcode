class Solution {
    public boolean detectCapitalUse(String word) {
        for(int i = 0; i < word.length()-1; i++) {
            char c = word.charAt(i), t = word.charAt(i+1);
            if((!isCaps(c) && isCaps(t)) || (isCaps(c) && !isCaps(t) && i > 0)) {
                return false;
            }
        }
        return true;
    }
               
    private boolean isCaps(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
