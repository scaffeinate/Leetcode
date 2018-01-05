package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/add-digits/description/
 */
public class AddDigits {
    public int addDigits(int num) {
        int mod = (num % 9);
        return (num == 0) ? 0 : ((mod == 0) ? 9 : mod);
    }
}
