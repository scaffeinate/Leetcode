class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                builder.append(reverse(temp.toString()));
                if(i > 0 && i < s.length()-1) {
                    builder.append(' ');
                }
                temp.setLength(0);
            } else {
                temp.append(c);
            }
        }
        return builder.append(reverse(temp.toString())).toString();
    }
    
    private String reverse(String word) {
        StringBuilder builder = new StringBuilder();
        for(int i = word.length()-1; i >= 0; i--) {
            builder.append(word.charAt(i));
        }
        return builder.toString();
    }
}
