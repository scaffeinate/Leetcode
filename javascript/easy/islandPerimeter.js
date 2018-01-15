/**
 * @param {number[][]} grid
 * @return {number}
 */
var islandPerimeter = function(grid) {
    let perimeter = 0;
    const dirs = [[0,1],[0,-1],[1,0],[-1,0]];
    for(let i = 0; i < grid.length; i++) {
        for(let j = 0; j < grid[i].length; j++) {
            if(grid[i][j] === 1) {
                for(let dir of dirs) {
                    if(isWater(i+dir[0], j+dir[1], grid)) {
                        perimeter++;
                    }
                }
            }
        }
    }
    return perimeter;
};

var isWater = function(x,y,grid) {
    return x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] === 0;
};
