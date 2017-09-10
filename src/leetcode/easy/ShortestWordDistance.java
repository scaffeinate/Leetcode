package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/shortest-word-distance/description/
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int k = -1, j = -1, shortest = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) k = i;
            if (words[i].equals(word2)) j = i;
            if (k != -1 && j != -1) shortest = Math.min(shortest, Math.abs(k - j));
        }
        return shortest;
    }
}
