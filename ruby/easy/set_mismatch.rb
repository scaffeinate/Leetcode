# @param {Integer[]} nums
# @return {Integer[]}
def find_error_nums(nums)
    res = Array.new
    nums.each do |num|
        n = num.abs - 1
        if nums[n] < 0
            res.push(n+1)
        else
            nums[n] = -nums[n]
        end
    end
    nums.each_with_index do |num, i|
        res.push(i+1) if num > 0
    end
    return res
end
