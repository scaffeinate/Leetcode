class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        while(n > 0) {
            if(prev == (n & 1)) {
                return false;
            }
            prev = (n & 1);
            n >>>= 1;
        }
        return true;
    }
}
