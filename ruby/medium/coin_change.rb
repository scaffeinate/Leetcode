# @param {Integer[]} coins
# @param {Integer} amount
# @return {Integer}
MAX = (2 ** 31) - 1
def coin_change(coins, amount)
    memo = Array.new(amount+1).fill(MAX)
    memo[0] = 0
    coins.each do |coin|
        for i in 1..amount
            if i >= coin && memo[i-coin] != MAX
                memo[i] = [memo[i], (memo[i-coin] + 1)].min
            end
        end
    end
    return memo.last == MAX ? -1 : memo.last
end
