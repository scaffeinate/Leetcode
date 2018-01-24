class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        if(length == 0) return null;
        
        int[] result = new int[length];
        for(int[] update : updates) {
            int start = update[0], end = update[1]+1, inc = update[2];
            result[start] += inc;
            if(end < length) {
                result[end] -= inc;
            }
        }

        for(int i = 0, sum = 0; i < length; i++) {
            result[i] += sum;
            sum = result[i];
        }

        return result;
    }
}
