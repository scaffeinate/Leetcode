package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/strobogrammatic-number/description/
 */
public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        int len = num.length();
        for (int i = 0; i < len; i++) {
            char rc = rotate(num.charAt(i));
            if (rc == '.' || rc != num.charAt(len - i - 1)) return false;
        }

        return true;
    }

    private char rotate(char c) {
        switch (c) {
            case '0':
                return '0';
            case '1':
                return '1';
            case '8':
                return '8';
            case '6':
                return '9';
            case '9':
                return '6';
        }
        return '.';
    }
}
