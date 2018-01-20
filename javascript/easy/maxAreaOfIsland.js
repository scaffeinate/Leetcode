/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxAreaOfIsland = function(grid) {
    let maxArea = 0, area = 0;
    const dirs = [[0,-1],[0,1],[1,0],[-1,0]];
    for(let i = 0; i < grid.length; i++) {
        for(let j = 0; j < grid[i].length; j++) {
            if(grid[i][j] === 1) {
                area = dfs(grid, i, j, dirs);
                maxArea = Math.max(maxArea, area);
            }
        }
    }
    return maxArea;
};

var dfs = function(grid, i, j, dirs) {
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] === 0) {
        return 0;
    }
    grid[i][j] = 0;
    let area = 1;
    for(let dir of dirs) {
        const x = (i + dir[0]), y = (j + dir[1]);
        area += dfs(grid, x, y, dirs);
    }
    
    return area;
}
