# @param {Integer[][]} grid
# @return {Integer}
def max_area_of_island(grid)
    max_area = 0
    dirs = [[0,1],[0,-1],[1,0],[-1,0]]
    for i in 0..grid.length-1
        for j in 0..grid[i].length-1
            if(grid[i][j] == 1)
                area = dfs(grid, i, j, dirs)
                max_area = [max_area, area].max
            end
        end
    end
    return max_area
end

def dfs(grid, i, j, dirs)
    stack = [[i, j]]
    area = 1
    while !stack.empty?
        c = stack.last
        i, j = c[0], c[1]
        grid[i][j] = 0
        count = 0
        dirs.each do |dir|
            x =(i + dir[0]) and y = (j + dir[1])
            if is_valid(grid, x, y)
                area += 1 and count += 1
                stack.push([x, y])
                break
            end
        end
        stack.pop if count == 0
    end
    return area
end

def is_valid(grid, i, j)
    return i >= 0 && i < grid.length && j >= 0 && j < grid[i].length && grid[i][j] == 1 
end
