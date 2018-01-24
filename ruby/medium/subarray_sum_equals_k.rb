# @param {Integer[]} nums
# @param {Integer} k
# @return {Integer}
def subarray_sum(nums, k)
    sum, count = 0, 0
    map = {}
    nums.each do |num|
        sum += num
        count += 1 if (sum == k)
        count += map[sum-k] if (map.has_key?(sum-k))
        map[sum] = (map.has_key?(sum) ? map[sum]+1 : 1)
    end
    return count
end
