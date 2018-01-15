# @param {Integer[]} nums
# @return {Integer}
def find_max_consecutive_ones(nums)
    count, max_consecutive_ones = 0, 0
    for i in 0..nums.length-1
        if nums[i] == 1
            count += 1
        else
            max_consecutive_ones = [max_consecutive_ones, count].max
            count = 0
        end
    end
    return [max_consecutive_ones, count].max
end
