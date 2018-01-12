# @param {Integer[]} nums
# @return {Boolean}
def contains_duplicate(nums)
    set = {}
    nums.each do |num|
        return true if set[num]
        set[num] = true
    end
    false
end