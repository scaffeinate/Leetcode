package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/sum-of-two-integers/description/
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        if (b == 0) return a;
        return getSum((a ^ b), ((a & b) << 1));
    }
}
