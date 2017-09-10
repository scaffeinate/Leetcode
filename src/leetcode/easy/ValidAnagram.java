package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counter = new int[32];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            counter[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) return false;
        }

        return true;
    }
}
