# @param {Integer[]} nums
# @return {Integer}
def dominant_index(nums)
    max, max_index = 0, -1
    nums.each_with_index do |num, i|
        if num > max
            max = num
            max_index = i
        end
    end
    nums.each do |num|
        return -1 if max != num && max < (2 * num)
    end
    return max_index
end
