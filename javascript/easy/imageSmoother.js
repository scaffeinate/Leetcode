/**
 * @param {number[][]} M
 * @return {number[][]}
 */
var imageSmoother = function(M) {
    const dirs = [[0,-1],[0,1],[-1,0],[1,0],[-1,-1],[1,1],[-1,1],[1,-1]];
    const res = [];
    for(let i = 0; i < M.length; i++) {
        const temp = [];
        for(let j = 0; j < M[i].length; j++) {
            temp.push(getAverage(M, i, j, dirs));
        }
        res.push(temp);
    }
    return res;
};

var getAverage = function(M, i, j, dirs) {
    let sum = M[i][j], count = 1;
    for(let dir of dirs) {
        let x = (i + dir[0]), y = (j + dir[1]);
        if(isValid(M, x, y)) {
            sum += M[x][y];
            count++;
        }
    }
    return parseInt(sum/count);
};

var isValid = function(M, i, j) {
    return i >= 0 && i < M.length && j >= 0 && j < M[i].length;    
};
