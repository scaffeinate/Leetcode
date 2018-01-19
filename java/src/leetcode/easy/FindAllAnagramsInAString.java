class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> results = new ArrayList<Integer>();
        if(s.length() < p.length()) return results;
        
        int[] counter = new int[26];
        int[] temp = new int[26];
        int sLen = s.length(), pLen = p.length();
        for(int i = 0; i < pLen; i++) { counter[p.charAt(i) - 'a']++; }
        for(int i = 0; i < pLen; i++) { temp[s.charAt(i) - 'a']++; }
        if(helper(counter, temp)) results.add(0);
        
        for(int i = 1; i < (sLen - pLen + 1); i++) {
            temp[s.charAt(i-1) - 'a']--;
            temp[s.charAt(i+pLen-1) - 'a']++;
            if(helper(counter, temp)) results.add(i);
        }
        return results;
    }
    
    private boolean helper(int[] counter, int[] temp) {
        for(int i = 0; i < 26; i++) {
            if(counter[i] != temp[i]) {
                return false;
            }
        }
        return true;
    }
}
