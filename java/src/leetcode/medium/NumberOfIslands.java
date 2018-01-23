class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        final int[][] directions = new int[][] {{0,1},{-1,0},{1,0},{0,-1}};
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    dfs(i, j, grid, directions);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    private void dfs(int i, int j, char[][] grid, int[][] directions) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        for(int[] dir : directions) {
            int x = i + dir[0], y = j + dir[1];
            dfs(x, y, grid, directions);
        }
    }
}
