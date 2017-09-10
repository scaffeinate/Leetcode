package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Question: https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            set.add(n);
            n = sumDigits(n);
            if (set.contains(n)) return false;
        }
        return true;
    }

    private int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = (n % 10);
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }
}
