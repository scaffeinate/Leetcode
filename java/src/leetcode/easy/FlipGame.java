package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Question: https://leetcode.com/problems/flip-game/description/
 */
public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<String>();
        char[] arr = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i - 1), c2 = s.charAt(i);
            if (c1 == '+' && c2 == '+') {
                arr[i] = '-';
                arr[i - 1] = '-';
                result.add(new String(arr));
                arr[i - 1] = c1;
                arr[i] = c2;
            }
        }
        return result;
    }
}
