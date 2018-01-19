public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> counter = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(counter.contains(c)) {
                counter.remove(c);
                count += 2;
            } else {
                counter.add(c);
            }
        }
        
        return count + ((count % 2 == 0) ? (counter.isEmpty() ? 0 : 1) : 0);
    }
}
