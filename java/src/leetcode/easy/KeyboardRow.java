class KeyboardRow {
    public String[] findWords(String[] words) {
        int[] rowInfo = new int[] { 1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2 };
        List<String> result = new ArrayList<String>();
        for(String word:words) {
            int row = helper(word.charAt(0), rowInfo);
            boolean add = true;
            for(int i = 1; i < word.length(); i++) {
                char c = word.charAt(i);
                if(row != helper(c, rowInfo)) {
                    add = false; break;
                }
            }
            if(add) { result.add(word); }
        }
        return result.toArray(new String[] {});
    }
    
    private int helper(char c, int[] rowInfo) {
        if(c >= 'a' && c <= 'z') {
            return rowInfo[c - 'a'];
        } else if(c >= 'A' && c <= 'Z') {
            return rowInfo[c - 'A'];
        }
        return 0;
    }
}
