class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[] { area, 1 };
        int diff = area, sqrt = (int) Math.sqrt(area);
        for(int i = 2; i <= sqrt; i++) {
            if(area % i == 0) {
                int j = (area/i);
                if(Math.abs(i - j) < diff) {
                    diff = Math.abs(i - j);
                    result[0] = Math.max(i, j);
                    result[1] = Math.min(i ,j);
                }
            }
        }
        return result;
    }
}
