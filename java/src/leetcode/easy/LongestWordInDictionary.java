class Solution {
    public String longestWord(String[] words) {
        Queue<String> queue = new LinkedList<>();
        Set<String> dict = new HashSet<>();
        String longest = "";
        for(String word : words) {
            dict.add(word);
        }
        queue.offer(longest);
        while(!queue.isEmpty()) {
            String current = queue.poll();
            if(longest.length() < current.length()) {
                longest = current;
            }
            
            for(char c = 'a'; c <= 'z'; c++) {
                String word = (current + c);
                if(dict.contains(word)) {
                    queue.offer(word);
                }
            }
        }
        
        return longest;
    }
}
