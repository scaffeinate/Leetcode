# @param {Integer[]} nums
# @return {Integer}
def pivot_index(nums)
    sums = Array.new(nums.length)
    sum = 0
    for i in 0..nums.length-1
        sum += nums[i]
        sums[i] = sum
    end
    
    for i in 0..nums.length-1
        left = (i == 0) ? 0 : (sums[i-1])
        right = (i == sums.length-1) ? 0 : (sums[sums.length-1] - sums[i])
        return i if (left == right)
    end
    return -1
end
