package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/isomorphic-strings/description/
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            charMap.put(c1, c2);
            reverseMap.put(c2, c1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (charMap.get(c1) != c2 || reverseMap.get(c2) != c1) {
                return false;
            }
        }

        return true;
    }
}
