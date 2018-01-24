# @param {Integer} m
# @param {Integer} n
# @return {Integer}
def unique_paths(m, n)
    memo = Array.new
    for i in 0..m-1
        arr = Array.new
        for j in 0..n-1
            arr.push(-1)
        end
        memo.push(arr)
    end
    return find_unique_paths(0, 0, m, n, memo)
end

def find_unique_paths(i, j, m, n, memo)
    if(i < 0 || i >= m || j < 0 || j >= n)
        return 0
    elsif(i == m-1 && j == n-1)
        return 1
    elsif(memo[i][j] == -1)
        memo[i][j] = find_unique_paths(i+1, j, m, n, memo) + find_unique_paths(i, j+1, m, n, memo)
    end
    return memo[i][j]
end
