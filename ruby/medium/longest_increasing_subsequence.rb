# @param {Integer[]} nums
# @return {Integer}
def length_of_lis(nums)
    return 0 unless nums.length > 0
    memo = Array.new(nums.length).fill(1)
    max = 1
    for i in 0..nums.length-1
        for j in i+1..nums.length-1
            if(nums[j] > nums[i])
                memo[j] = [memo[j], memo[i]+1].max
                max = [max, memo[j]].max
            end
        end
    end
    return max
end
