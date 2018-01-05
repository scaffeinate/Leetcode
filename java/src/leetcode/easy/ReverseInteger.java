package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseInteger {
    public int reverse(int x) {
        long abs = Math.abs((long) x), res = 0;
        if (abs <= Integer.MAX_VALUE) {
            while (abs > 0) {
                res = res * 10 + (abs % 10);
                abs /= 10;
            }
            res = (res > Integer.MAX_VALUE ? 0 : (x < 0 ? -res : res));
        }
        return (int) res;
    }
}
