# @param {Integer[][]} image
# @param {Integer} sr
# @param {Integer} sc
# @param {Integer} new_color
# @return {Integer[][]}
def flood_fill(image, sr, sc, new_color)
    queue = []
    visited = Set.new
    original_color = image[sr][sc]
    dirs = [[0,-1],[0,1],[1,0],[-1,0]]
    queue.push([sr, sc])
    while !queue.empty?
        c = queue.shift
        visited.add(c.to_s)
        i, j = c[0], c[1]
        image[i][j] = new_color
        dirs.each do |dir|
            x = i + dir[0]
            y = j + dir[1]
            queue.push([x, y]) if !visited.include?([x,y].to_s) && is_valid(image, x, y, original_color)
        end
    end
    return image
end

def is_valid(image, i, j, original_color)
    return i >= 0 && i < image.length && j >= 0 && j < image[i].length && image[i][j] == original_color
end
