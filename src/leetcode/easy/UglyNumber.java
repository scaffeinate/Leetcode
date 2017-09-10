package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/ugly-number/description/
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        int[] factors = {2, 3, 5};
        while (num > 1) {
            int temp = num;
            for (int factor : factors) {
                if (num % factor == 0) {
                    num /= factor;
                    break;
                }
            }
            if (temp == num) return false;
        }
        return (num == 1);
    }
}
