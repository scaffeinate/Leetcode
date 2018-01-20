class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if(words1.length != words2.length) {
            return false;
        }
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        for(String[] pair : pairs) {
            String w1 = pair[0], w2 = pair[1];
            Set<String> set = map.getOrDefault(w1, new HashSet<>());
            set.add(w2);
            map.putIfAbsent(w1, set);
        }
        
        for(int i = 0; i < words1.length; i++) {
            String w1 = words1[i], w2 = words2[i];
            if((w1.equals(w2)) || (map.getOrDefault(w1, new HashSet<>()).contains(w2)) 
               || (map.getOrDefault(w2, new HashSet<>()).contains(w1))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
