# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def max_sub_array_len(nums, k)
    map = {}
    sum, max_len = 0, 0
    nums.each_with_index do |num, i|
        sum += num
        if sum == k
            max_len = [max_len, i+1].max
        elsif map.has_key?(sum-k)
            max_len = [max_len, (i - map[sum-k])].max
        end
        map[sum] = i if !map.has_key?(sum)
    end
    return max_len
end
