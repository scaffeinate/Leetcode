# @param {Integer} n
# @return {Integer}
def climb_stairs(n)
    return climb_stairs_memo(n, [])
end

def climb_stairs_memo(n, memo)
    if n == 0
        return 1
    elsif n < 0
        return 0
    elsif memo[n].nil?
        memo[n] = climb_stairs(n-1, memo) + climb_stairs(n-2, memo);
    end
    return memo[n]
end
