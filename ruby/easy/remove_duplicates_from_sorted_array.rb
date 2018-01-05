# @param {Integer[]} nums
# @return {Integer}
def remove_duplicates(nums)
    return 0 if nums.empty?
    i = j = 0
    for j in 0..nums.length-1
      if(nums[i] != nums[j])
        i += 1
        nums[i] = nums[j]
      end
    end
    return i+1
end