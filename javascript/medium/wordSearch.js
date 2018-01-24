/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function(board, word) {
    const dirs = [[0,-1],[0,1],[1,0],[-1,0]];
    for(let i = 0; i < board.length; i++) {
        for(let j = 0; j < board[i].length; j++) {
            if(dfs(i, j, 0, board, word, dirs)) {
                return true;
            }
        }
    }
    return false;
};

var dfs = function(i, j, index, board, word, dirs) {
    if(index === word.length) {
        return true;
    } else if(i >= 0 && i < board.length 
              && j >= 0 && j < board[i].length 
              && board[i][j] !== '*' && board[i][j] === word[index]) {
        const c = board[i][j];
        board[i][j] = '*';
        for(let dir of dirs) {
            if(dfs(i+dir[0], j+dir[1], index+1, board, word, dirs)) {
                return true;
            }
        }
        board[i][j] = c;
    }
    return false;
};
