# @param {Integer[][]} m
# @return {Integer[][]}
def image_smoother(m)
    dirs = [[0,-1],[0,1],[-1,0],[1,0],[-1,-1],[1,1],[-1,1],[1,-1]]
    res = Array.new()
    for i in 0..m.length-1
        temp = Array.new()
        for j in 0..m[i].length-1
            temp[j] = avg(m, i, j, dirs)
        end
        res.push(temp)
    end
    return res
end

def avg(m, i, j, dirs)
    sum = m[i][j]
    count = 1
    dirs.each do |dir|
        x = i + dir[0]
        y = j + dir[1]
        if valid(m, x, y)
            sum += m[x][y]
            count += 1
        end
    end
    return (sum/count)
end

def valid(m, x, y)
    return x >= 0 && x < m.length && y >= 0 && y < m[x].length
end
