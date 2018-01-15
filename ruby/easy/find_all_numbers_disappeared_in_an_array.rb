# @param {Integer[]} nums
# @return {Integer[]}
def find_disappeared_numbers(nums)
    res = Array.new
    nums.each do |num|
        i = num.abs
        nums[i-1] = -nums[i-1] if nums[i-1] > 0
    end
    for i in 0..nums.length-1
        res.push(i+1) if nums[i] > 0
    end
    return res
end
