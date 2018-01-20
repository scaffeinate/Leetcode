class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int[][] dirs = new int[][] {{0,1}, {0,-1},{1,0},{-1,0}};
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(grid, i, j, dirs);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    
    private int dfs(int[][] grid, int i, int j, int[][] dirs) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        for(int[] dir : dirs) {
            area += dfs(grid, i+dir[0], j+dir[1], dirs);
        }
        return area;
    }
}
