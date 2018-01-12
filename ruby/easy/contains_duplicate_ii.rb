# @param {Integer[]} nums
# @param {Integer} k
# @return {Boolean}
def contains_nearby_duplicate(nums, k)
    map = {}
    nums.each_with_index do |num, i|
        return true if map[num] && (map[num] - i).abs <= k
        map[num] = i
    end
    false
end