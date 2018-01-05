# @param {Integer[]} nums
# @param {Integer} val
# @return {Integer}
def remove_element(nums, val)
    i = 0
    for j in 0..nums.length-1
      if(nums[j] != val)
        nums[i] = nums[j]
        i += 1
      end
    end
    return i
end