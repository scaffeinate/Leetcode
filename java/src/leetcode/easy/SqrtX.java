package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/sqrtx/description/
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        return bs(x, 0, x);
    }

    private int bs(int x, int start, int end) {
        if (start >= end) return end - 1;

        long middle = (start + end) / 2;
        long sqr = middle * middle;
        if (sqr == x) {
            return (int) middle;
        } else if (sqr > x) {
            return bs(x, start, (int) middle);
        } else {
            return bs(x, (int) middle + 1, end);
        }
    }
}
