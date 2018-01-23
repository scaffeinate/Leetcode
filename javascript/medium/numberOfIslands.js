/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    const dirs = [[0,-1],[0,1],[1,0],[-1,0]];
    let count = 0;
    for(let i = 0; i < grid.length; i++) {
        for(let j = 0; j < grid[i].length; j++) {
            if(grid[i][j] === '1') {
                bfs(grid, i, j, dirs);
                count++;
            }
        }
    }
    return count;
};

var bfs = function(grid, i, j, dirs) {
    const queue = new Array();
    queue.push([i, j]);
    while(queue.length > 0) {
        const c = queue.shift();
        const i = c[0], j = c[1];
        for(let dir of dirs) {
            let x = i + dir[0], y = j + dir[1];
            if(isValid(grid, x, y)) {
                grid[x][y] = '0';
                queue.push([x, y]);
            }
        }
    }
};

var isValid = function(grid, i, j) {
    return i >= 0 && i < grid.length && j >= 0 && j < grid[i].length && grid[i][j] === '1';
};


