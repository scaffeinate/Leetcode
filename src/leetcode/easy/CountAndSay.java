package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/count-and-say/description/
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n <= 1) {
            return "1";
        } else {
            String word = countAndSay(n - 1);
            StringBuilder builder = new StringBuilder();
            int i = 0, count = 1, len = word.length();
            for (; i < len - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    count++;
                } else {
                    builder.append(count).append(word.charAt(i));
                    count = 1;
                }
            }

            builder.append(count).append(word.charAt(i));
            return builder.toString();
        }
    }
}
