/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} newColor
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, newColor) {
    if(image[sr][sc] !== newColor) {
        dfs(image, sr, sc, image[sr][sc], newColor);    
    }
    return image;
};

var dfs = function(image, i, j, originalColor, newColor) {
    if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != originalColor) {
        return;
    }
    image[i][j] = newColor;
    let dirs = [[0,1],[0,-1],[1,0],[-1,0]];
    for(let dir of dirs) {
        let x = i + dir[0], y = j + dir[1];
        dfs(image, x, y, originalColor, newColor);
    }
};
