# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}
def intersect(nums1, nums2)
    map,res = {}, []
    nums1.each do |num|
        map[num] = (map[num] ? map[num] : 0) + 1
    end
    nums2.each do |num|
        res.push(num) and map[num] -= 1 if map[num]
        map[num] = nil if map[num] == 0
    end
    return res
end
