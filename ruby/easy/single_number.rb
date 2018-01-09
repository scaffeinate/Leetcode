# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)
    xor = 0
    nums.each do |num|
        xor ^= num
    end
    return xor
end
