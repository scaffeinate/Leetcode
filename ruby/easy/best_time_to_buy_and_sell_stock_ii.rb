# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    max_profit = 0
    for i in 1..prices.length-1
        profit = prices[i] - prices[i-1]
        max_profit += profit if profit > 0
    end
    return max_profit
end
