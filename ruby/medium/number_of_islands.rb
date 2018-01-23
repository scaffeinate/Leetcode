# @param {Character[][]} grid
# @return {Integer}
def num_islands(grid)
    dirs = [[0,-1],[0,1],[1,0],[-1,0]]
    count = 0
    for i in 0..grid.length-1
        for j in 0..grid[i].length-1
            if grid[i][j] == '1'
                dfs(grid, i, j, dirs)
                count += 1
            end
        end
    end
    return count
end

def dfs(grid, i, j, dirs)
    return if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1')
    grid[i][j] = '0'
    dirs.each do |dir|
        x = i + dir[0]
        y = j + dir[1]
        dfs(grid, x, y, dirs)
    end
end
