# @param {Integer[]} nums
# @return {Integer[][]}
def subsets(nums)
    res, temp = Array.new, Array.new
    generate(0, nums, temp, res)
    return res
end

def generate(index, nums, temp, res)
    res.push(temp.dup)
    for i in index..nums.length-1
        temp.push(nums[i])
        generate(i+1, nums, temp, res)
        temp.pop
    end
end
