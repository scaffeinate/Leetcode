# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
    running, max_sum = 0, -((2 ** 31) - 1)
    nums.each do |num|
        running = [num, running+num].max
        max_sum = [running, max_sum].max
    end
    return max_sum
end
