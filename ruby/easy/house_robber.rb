# @param {Integer[]} nums
# @return {Integer}
def rob(nums)
    memo = [0]
    nums.each do |num|
        memo.push(num)
    end
    for i in 2..memo.length-1
        memo[i] = [memo[i-1], nums[i-1] + memo[i-2]].max
    end
    return memo[memo.length-1]
end