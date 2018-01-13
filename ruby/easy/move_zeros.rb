# @param {Integer[]} nums
# @return {Void} Do not return anything, modify nums in-place instead.
def move_zeroes(nums)
    i,j = 0,0
    while j < nums.length
        if(nums[j] != 0)
            nums[i] = nums[j]
            nums[j] = 0 if i != j
            i += 1
        end
        j += 1
    end
end
