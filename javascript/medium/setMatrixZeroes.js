/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    if(matrix.length === 0) return;
    let firstRowZero = false, firstColZero = false;
    for(let i = 0; i < matrix.length; i++) {
        for(let j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j] === 0) {
                if(i === 0) {
                    firstRowZero = true;
                } 
                if(j === 0) {
                    firstColZero = true;
                }
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }
    
    for(let i = 1; i < matrix.length; i++) {
        if(matrix[i][0] === 0) {
            nullifyRow(matrix, i);
        }
    }
    
    for(let i = 1; i < matrix[0].length; i++) {
        if(matrix[0][i] === 0) {
            nullifyColumn(matrix, i);
        }
    }
    
    if(firstRowZero) {
        nullifyRow(matrix, 0);
    }
    
    if(firstColZero) {
        nullifyColumn(matrix, 0);
    }
};

var nullifyRow = function(matrix, row) {
    for(let i = 0; i < matrix[row].length; i++) {
        matrix[row][i] = 0;
    }    
};

var nullifyColumn = function(matrix, col) {
    for(let i = 0; i < matrix.length; i++) {
        matrix[i][col] = 0;
    }    
};
