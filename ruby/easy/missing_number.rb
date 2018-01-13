# @param {Integer[]} nums
# @return {Integer}
def missing_number(nums)
    expected_sum = (nums.length * (nums.length+1))/2
    sum = 0
    nums.each do |num|
        sum += num
    end
    return expected_sum - sum
end
