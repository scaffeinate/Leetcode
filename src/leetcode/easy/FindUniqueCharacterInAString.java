package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FindUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] counter = new int[32];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (counter[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
