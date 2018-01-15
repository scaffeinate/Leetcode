class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        while(xor > 0) {
            if((xor & 1) == 1) count++;
            xor >>>= 1;
        }
        return count;
    }
}
