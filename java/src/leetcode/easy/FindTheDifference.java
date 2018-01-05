package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/find-the-difference/description/
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] counter = new int[32];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            counter[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                return (char) ('a' + i);
            }
        }

        return 0;
    }
}
