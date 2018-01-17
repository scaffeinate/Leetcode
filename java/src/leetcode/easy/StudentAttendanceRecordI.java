class Solution {
    public boolean checkRecord(String s) {
        int i = 0, aCount = 0, lCount = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if(c == 'L') {
                lCount++;
                i++; continue;
            }
            
            if(c == 'A') {
                aCount++;
            }
            
            if(lCount > 2 || aCount > 1) {
                return false;
            }
            lCount = 0;
            i++;
        }
        return (aCount <= 1) && (lCount <= 2);
    }
}
