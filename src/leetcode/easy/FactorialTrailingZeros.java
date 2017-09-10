package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/factorial-trailing-zeroes/description/
 */
public class FactorialTrailingZeros {
    public int trailingZeroes(int n) {
        int numTwos = 0, numFives = 0;
        for (long i = 2; i <= n; i *= 2) {
            numTwos += (n / i);
        }
        for (long i = 5; i <= n; i *= 5) {
            numFives += (n / i);
        }

        return Math.min(numTwos, numFives);
    }
}
