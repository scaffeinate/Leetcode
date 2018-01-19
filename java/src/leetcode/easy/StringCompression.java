class StringCompression {
    public int compress(char[] chars) {
        if(chars.length == 0) return 0;
        
        int i = 0, j = 0, k = 0;
        while(j < chars.length) {
            if(chars[i] != chars[j]) {
                k = fillChars(chars, i, j, k);
                i = j;
            }
            j++;
        }
        k = fillChars(chars, i, j, k);
        return k;
    }
    
    private int fillChars(char[] chars, int i, int j, int k) {
        int diff = (j - i);
        chars[k++] = chars[i];
        if(diff > 1) {
            Stack<Character> stack = new Stack<Character>();
            while(diff > 0) {
                stack.push((char) ('0' + (diff%10)));
                diff /= 10;
            }
            while(!stack.isEmpty()) {
                chars[k] = stack.pop();
                k++;
            }
        }
        return k;
    }
}
