# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def find_pairs(nums, k)
    nums.sort!
    i, count = 0, 0
    while i < nums.length
        num = nums[i]
        i += 1
        if binary_search(i, nums.length-1, nums, (num + k))
            count += 1
        end
        while i < nums.length && num == nums[i]
           i += 1
        end
    end
    return count
end

def binary_search(start, stop, nums, target)
    while start <= stop
        middle = (start + stop)/2
        if(nums[middle] == target)
            return true
        elsif nums[middle] > target
            stop = middle-1
        else
            start = middle+1
        end
    end
    return false
end
