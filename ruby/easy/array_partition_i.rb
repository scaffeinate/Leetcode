# @param {Integer[]} nums
# @return {Integer}
def array_pair_sum(nums)
    nums.sort!
    i = sum = 0
    while i < nums.length
        sum += nums[i]
        i += 2
    end
    return sum
end
