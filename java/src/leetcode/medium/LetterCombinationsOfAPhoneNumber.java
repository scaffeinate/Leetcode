class Solution {
    final String[] digitStrings = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<String>();
        if(digits.length() > 0) {
            letterCombinations(digits, 0, new StringBuilder(), results);
        }
        return results;
    }
    
    private void letterCombinations(String digits, int index, StringBuilder builder, List<String> results) {
        if(index == digits.length()) {
            results.add(builder.toString());            
        } else {
            char c = digits.charAt(index);
            String key = digitStrings[c-'0'];
            for(int i = 0; i < key.length(); i++) {
                builder.append(key.charAt(i));
                letterCombinations(digits, index+1, builder, results);
                builder.setLength(builder.length() - 1);
            }
        }
    }
}
