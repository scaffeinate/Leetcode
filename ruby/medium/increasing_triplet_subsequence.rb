# @param {Integer[]} nums
# @return {Boolean}
def increasing_triplet(nums)
    return false if nums.length < 3
    i, j = 0, 1
    min_i, min_j = ((2 ** 31) - 1), ((2 ** 31) - 1)
    while j < nums.length
        return true if nums[j] > min_j
        if nums[j] <= nums[i]
            i = j
        else
            min_i = [min_i, nums[i]].min
            min_j = [min_j, nums[j]].min
        end
        j += 1
    end
    return false
end
