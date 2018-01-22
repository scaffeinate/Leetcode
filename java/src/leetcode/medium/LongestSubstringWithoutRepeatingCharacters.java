public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Map<Character, Integer> indexMap = new HashMap<Character, Integer>();
        while(j < s.length()) {
            char c = s.charAt(j);
            if(indexMap.containsKey(c) && indexMap.get(c) >= i) {
                i = indexMap.get(c) + 1;
            }
            max = Math.max(max, (j - i + 1));
            indexMap.put(c, j);
            j++;
        }
    
        return max;
    }
}
