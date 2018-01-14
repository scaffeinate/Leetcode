# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}
def intersection(nums1, nums2)
    map, res = {}, Array.new
    nums1.each do |num|
        map[num] = true
    end
    nums2.each do |num|
        res.push(num) and map[num] = nil if !map[num].nil?
    end
    return res
end
