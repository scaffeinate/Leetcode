# @param {Integer[]} nums
# @return {Integer}
def maximum_product(nums)
    nums.sort!
    return [(nums[0] * nums[1] * nums.last), (nums.last * nums[nums.length-2] * nums[nums.length-3])].max 
end
