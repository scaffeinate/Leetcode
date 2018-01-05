package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/implement-strstr/description/
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.trim().isEmpty()) return 0;
        if (needle.length() > haystack.length()) {
            return -1;
        } else if (needle.length() == haystack.length()) {
            return needle.equals(haystack) ? 0 : -1;
        } else {
            for (int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
                if (needle.equals(haystack.substring(i, i + needle.length()))) {
                    return i;
                }
            }
        }

        return -1;
    }
}
