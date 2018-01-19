class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        if(s.length() == 0) return 0;
        int count = 1, prevCount = 0, totalCount = 0, i = 1;
        char c = s.charAt(0);
        while(i < s.length()) {
            if(s.charAt(i) == c) {
                count++;
                i++; continue;
            }
            if(prevCount > 0) {
                totalCount += Math.min(count, prevCount);
            }
            c = s.charAt(i);
            prevCount = count;
            count = 1;
            i++;
        }
        return totalCount + Math.min(count, prevCount);
    }
}
