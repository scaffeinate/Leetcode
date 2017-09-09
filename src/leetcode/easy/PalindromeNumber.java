package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        Wrapper w = new Wrapper();
        palindrome(Math.abs(x), w);
        return (w.val == x);
    }

    private void palindrome(int x, Wrapper w) {
        if (x == 0) return;
        palindrome(x / 10, w);
        int digit = (x % 10);
        w.val = (w.val + digit * (int) Math.pow(10, w.pow));
        w.pow++;
    }

    static class Wrapper {
        int val = 0, pow = 0;
    }
}
