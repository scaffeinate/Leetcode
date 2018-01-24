class Solution {
    public boolean exist(char[][] board, String word) {
        final int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(exist(board, i, j, word, 0, directions)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean exist(char[][] board, int i, int j, String word, int index, int[][] directions) {
        if(index == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] == '$' || 
            board[i][j] != word.charAt(index)) {
            return false;
        }
        
        char c = board[i][j];
        board[i][j] = '$';
        for(int[] dir : directions) {
            int x = i + dir[0], y = j + dir[1];
            if(exist(board, x, y, word, index+1, directions)) {
                return true;
            }
        }
        board[i][j] = c;
        return false;
    }
}
