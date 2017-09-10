package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/palindrome-permutation/description/
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        boolean[] counter = new boolean[256];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counter[c] = !counter[c];
        }

        for (boolean b : counter) if (b) count++;
        return (count <= 1);
    }
}
