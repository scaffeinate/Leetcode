# @param {Integer[]} nums
# @param {Integer} lower
# @param {Integer} upper
# @return {String[]}
def find_missing_ranges(nums, lower, upper)
    res = Array.new
    if nums.length == 0
        add_missing_str(lower, upper, res)
    else
        add_missing_str(lower, nums[0]-1, res)
        for i in 1..nums.length-1
            add_missing_str(nums[i-1]+1, nums[i]-1, res)
        end
        add_missing_str(nums[nums.length-1]+1, upper, res)
    end
    return res
end
        
def add_missing_str(lower, upper, res)
    if upper >= lower
        diff = (upper - lower)
        str = lower.to_s
        str += ("->" + upper.to_s) if diff > 0
        res.push(str)
    end
end
