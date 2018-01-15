# @param {Integer[][]} grid
# @return {Integer}
def island_perimeter(grid)
    perimeter = 0
    dirs = [[0,1],[0,-1],[1,0],[-1,0]]
    for i in 0..grid.length-1
        for j in 0..grid[i].length-1
            if grid[i][j] == 1
                dirs.each do |dir|
                    perimeter += 1 if is_water(i+dir[0], j+dir[1], grid)
                end
            end
        end
    end
    return perimeter
end

def is_water(x, y, grid)
    return x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] == 0
end
