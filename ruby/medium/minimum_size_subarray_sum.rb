# @param {Integer} s
# @param {Integer[]} nums
# @return {Integer}
MAX = ((2 ** 31) -1)
def min_sub_array_len(s, nums)
    min_size = MAX
    i, j, sum = 0, 0, 0
    while j < nums.length
        sum += nums[j]
        while(i <= j && sum >= s)
            min_size = [min_size, (j-i+1)].min
            sum -= nums[i]
            i += 1
        end
        j += 1
    end
    return (min_size == MAX) ? 0 : min_size
end
