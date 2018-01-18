class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;
        for(int[] op : ops) {
            if(op[0] < minRow) {
                minRow = op[0];
            }
            
            if(op[1] < minCol) {
                minCol = op[1];
            }
        }
        return minRow * minCol;
    }
}
