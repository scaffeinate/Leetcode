package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/valid-palindrome/description/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (isAlphanumeric(c1) && isAlphanumeric(c2)) {
                if (!eq(c1, c2)) return false;
                i++;
                j--;
            }
            if (!isAlphanumeric(c1)) i++;
            if (!isAlphanumeric(c2)) j--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private boolean eq(char c1, char c2) {
        c1 = (c1 >= 'A' && c1 <= 'Z') ? (char) (c1 - 'A' + 'a') : c1;
        c2 = (c2 >= 'A' && c2 <= 'Z') ? (char) (c2 - 'A' + 'a') : c2;
        return c1 == c2;
    }
}
