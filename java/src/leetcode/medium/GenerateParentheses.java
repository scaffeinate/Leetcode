public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        generateParenthesis(0, 0, n, new StringBuilder(), results);
        return results;
    }
    
    private void generateParenthesis(int open, int closed, int n, StringBuilder builder, List<String> results) {
        if(open == n && closed == n) {
            results.add(builder.toString());
            return;
        }
        
        if(open < n) {
            generateParenthesis(open+1, closed, n, builder.append('('), results);
            builder.setLength(builder.length() - 1);
        }
        
        if(closed < open) {
            generateParenthesis(open, closed + 1, n, builder.append(')'), results);
            builder.setLength(builder.length() - 1);
        }
    }
}
