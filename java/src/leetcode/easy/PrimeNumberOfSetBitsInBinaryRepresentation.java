class Solution {
    public int countPrimeSetBits(int L, int R) {
        int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
        int totalCount = 0;
        while(L <= R) {
            int num = L, count = 0;
            while(num > 0) {
                if((num & 1) == 1) {
                    count++;
                }
                num >>>= 1;
            }
            for(int i = 0; i < primes.length; i++) {
                if(primes[i] == count) {
                    totalCount++;
                    break;
                }
            }
            L++;
        }
        return totalCount;
    }
}
