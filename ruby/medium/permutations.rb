# @param {Integer[]} nums
# @return {Integer[][]}
def permute(nums)
    res = Array.new
    generate(0, nums, res)
    return res
end

def generate(index, nums, res)
    if(index == nums.length)
        res.push(nums.dup)
        return
    end
    
    for i in index..nums.length-1
        swap(nums, i, index)
        generate(index+1, nums, res)
        swap(nums, index, i)
    end
end

def swap(nums, i, j)
    return if i == j
    nums[i] = nums[i] + nums[j]
    nums[j] = nums[i] - nums[j]
    nums[i] = nums[i] - nums[j]
end
