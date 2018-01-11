# @param {Integer[]} nums
# @param {Integer} k
# @return {Void} Do not return anything, modify nums in-place instead.
def rotate(nums, k)
    n, k = nums.length, k % nums.length
    reverse(nums, 0, n-k-1)
    reverse(nums, n-k, n-1)
    reverse(nums, 0, n-1)
end

def reverse(nums, start, stop)
    i, j = start, stop
    while i < j
        nums[i] = nums[i] + nums[j]
        nums[j] = nums[i] - nums[j]
        nums[i] = nums[i] - nums[j]
        i += 1 and j -= 1
    end
end
