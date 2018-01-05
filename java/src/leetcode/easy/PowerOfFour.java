package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/power-of-four/description/
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num > 0 && ((num & num - 1) == 0) && ((num - 1) % 3) == 0;
    }
}
