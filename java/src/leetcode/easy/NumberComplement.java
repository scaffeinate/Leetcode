class Solution {
    public int findComplement(int num) {
        int result = 0, i = 0;
        while(num > 0) {
            result |= (((num & 1) == 0 ? 1 : 0) << i++);
            num >>>= 1;
        }
        return result;
    }
}
