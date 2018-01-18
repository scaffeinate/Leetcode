class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length == 0 || (nums.length * nums[0].length != (r * c))) {
            return nums;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        int[][] result = new int[r][c];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                queue.offer(nums[i][j]);
            }
        }
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                result[i][j] = queue.poll();
            }
        }
        
        return result;
    }
}
