class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean isOneBit = false;
        int i = 0;
        while(i < bits.length) {
            isOneBit = (bits[i] == 0);
            i += ((bits[i] == 1) ? 2 : 1);
        }
        return isOneBit;
    }
}
