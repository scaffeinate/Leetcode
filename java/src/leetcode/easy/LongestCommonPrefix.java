package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        if (strs.length == 0) return builder.toString();

        int minLen = Integer.MAX_VALUE, len = 0;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        boolean isSame = true;
        for (int i = 0; i < minLen && isSame; i++) {
            isSame = true;
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}
