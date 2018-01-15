public class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0) return 0;
        int perimeter = 0;
        int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    for(int[] direction:directions) {
                        int x = i + direction[0];
                        int y = j + direction[1];
                        if(x < 0 || x >= grid.length || y < 0 || y >= grid[i].length || grid[x][y] == 0) {
                            perimeter++;
                        }
                    }
                }
            }
        }
        
        return perimeter;
    }
}
