package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/number-of-1-bits/description/
 */
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0, i = 0;
        while (i < 32) {
            count += (((n & 1) == 1) ? 1 : 0);
            n >>>= 1;
            i++;
        }
        return count;
    }
}
