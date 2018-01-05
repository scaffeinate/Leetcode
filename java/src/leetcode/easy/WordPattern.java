package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/word-pattern/description/
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> revMap = new HashMap<>();
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            charMap.putIfAbsent(c, words[i]);
            revMap.putIfAbsent(words[i], c);

            if ((charMap.containsKey(c) && !charMap.get(c).equals(words[i])) ||
                    (revMap.containsKey(words[i]) && !revMap.get(words[i]).equals(c))) {
                return false;
            }
        }
        return true;
    }
}
