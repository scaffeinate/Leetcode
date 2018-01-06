# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search_insert(nums, target)
    return bs(nums, 0, nums.length-1, target)
end

def bs(nums, start, stop, target)
    return stop+1 if start > stop
    middle = ((start + stop)/2).to_i
    if(nums[middle] == target)
        return middle
    elsif nums[middle] > target
        return bs(nums, start, middle-1, target)
    else
        return bs(nums, middle+1, stop, target)
    end
end
