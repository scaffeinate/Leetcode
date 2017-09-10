package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/power-of-two/description/
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
