class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        int maxLen = 0;
        List<String> columns = new ArrayList<String>();
        for(int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if(maxLen < word.length()) {
                maxLen = word.length();
            }
        }
        
        for(int i = 0; i < maxLen; i++) {
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < words.size(); j++) {
                String word = words.get(j);
                if(i < word.length()) {
                    builder.append(word.charAt(i));
                }
            }
            columns.add(builder.toString());
        }
        
        for(int i = 0; i < words.size(); i++) {
            if(i >= columns.size() || !words.get(i).equals(columns.get(i))) {
                return false;
            }
        }
        return true;
    }
}
