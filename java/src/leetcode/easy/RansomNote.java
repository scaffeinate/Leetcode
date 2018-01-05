package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/ransom-note/description/
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!counter.containsKey(c) || counter.get(c) == 0) return false;
            counter.put(c, counter.get(c) - 1);
        }

        return true;
    }
}
