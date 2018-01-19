# @param {Integer[]} nums
# @return {Integer}
def find_length_of_lcis(nums)
    return 0 if nums.length == 0
    lcis = count = 1
    for i in 1..nums.length-1
        if(nums[i] > nums[i-1])
            count += 1
        else
            count = 1
        end
        lcis = [lcis, count].max
    end
    return lcis
end
