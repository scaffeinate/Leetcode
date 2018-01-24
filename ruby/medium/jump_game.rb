# @param {Integer[]} nums
# @return {Boolean}
def can_jump(nums)
    i, j = nums.length-2, nums.length-1
    while i >= 0
        j = i if((nums[i] + i) >= j)
        i -= 1
    end
    return j == 0
end
