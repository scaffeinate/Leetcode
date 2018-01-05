package leetcode.easy;

import java.util.Arrays;

/**
 * Question: https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] plusone = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            plusone[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            plusone[0] = carry;
            return plusone;
        } else {
            return Arrays.copyOfRange(plusone, 1, plusone.length);
        }
    }
}
