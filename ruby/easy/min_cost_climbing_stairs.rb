# @param {Integer[]} cost
# @return {Integer}
def min_cost_climbing_stairs(cost)
    memo = []
    return [min_cost(0, cost, memo), min_cost(1, cost, memo)].min
end

def min_cost(i, cost, memo)
    if i == cost.length
        return 0
    elsif i > cost.length
        return (2 ** 31) - 1
    elsif !memo[i]
        memo[i] = cost[i] + [min_cost(i+1, cost, memo), min_cost(i+2, cost, memo)].min
    end
    return memo[i]
end
