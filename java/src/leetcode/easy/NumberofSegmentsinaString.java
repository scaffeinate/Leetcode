class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int count = 0, val = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != ' ') {
                val = 1;
            } else {
                count += val;
                val = 0;
            }
        }
        
        return count+val;
    }
}
