package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToInteger {
    private final Map<Character, Integer> charMap = new HashMap<>();

    public RomanToInteger() {
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            int val1 = charMap.get(s.charAt(i));
            int val2 = (i == s.length() - 1) ? 0 : charMap.get(s.charAt(i + 1));
            if (val1 < val2) {
                val -= val1;
            } else {
                val += val1;
            }
        }

        return val;
    }
}
