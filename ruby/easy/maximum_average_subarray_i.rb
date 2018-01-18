# @param {Integer[]} nums
# @param {Integer} k
# @return {Float}
def find_max_average(nums, k)
    max_average = sum = 0
    n = [nums.length, k].min
    for i in 0..n-1
        sum += nums[i]
    end
    max_average = (sum.to_f/n)
    for i in n..nums.length-1
        sum = sum - nums[i-n] + nums[i]
        max_average = [max_average, (sum.to_f/k)].max
    end
    return max_average
end
