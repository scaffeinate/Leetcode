# @param {Character[][]} board
# @param {String} word
# @return {Boolean}
DIRS = [[0,-1],[0,1],[-1,0],[1,0]]
def exist(board, word)
    for i in 0..board.length-1
        for j in 0..board[i].length-1
            return true if(dfs(i, j, 0, board, word))
        end
    end
    return false
end

def dfs(i, j, index, board, word)
    if(index == word.length)
        return true
    elsif(i < 0 || i >= board.length || j < 0 || j >= board[i].length || 
                    board[i][j] == '!' || board[i][j] != word[index])
        return false
    else
        c = board[i][j]
        board[i][j] = '!'
        DIRS.each do |dir|
            x = i + dir[0]
            y = j + dir[1]
            return true if(dfs(x, y, index+1, board, word))
        end
        board[i][j] = c
        return false
    end
end
