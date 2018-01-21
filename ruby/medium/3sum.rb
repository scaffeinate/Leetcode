# @param {Integer[]} nums
# @return {Integer[][]}
def three_sum(nums)
    nums.sort!
    i, num = 0, 0
    res = Array.new
    while(i < nums.length)
        if(i > 0 && num == nums[i])
            i += 1
            next
        end
        num = nums[i]
        find_pairs(nums, i+1, -num, res)
        i += 1
    end
    return res
end

def find_pairs(nums, index, target, res)
    i, j = index, nums.length-1
    while i < j
        sum = nums[i] + nums[j]
        if(sum == target)
            n1, n2 = nums[i], nums[j]
            res.push([-target, n1, n2])
            while(i < j && n1 == nums[i]) 
                i += 1
            end
            while(i < j && n2 == nums[j]) 
                j -= 1 
            end
        elsif(sum < target)
            i += 1
        else
            j -= 1
        end
    end
end
