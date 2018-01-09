# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    i, max_profit = 0, 0
    prices.each_with_index do |price, j|
        max_profit = [max_profit, (price - prices[i])].max
        i = j if(price < prices[i])
    end
    return max_profit
end
