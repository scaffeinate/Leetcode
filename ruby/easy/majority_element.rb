# @param {Integer[]} nums
# @return {Integer}
def majority_element(nums)
    counter, max_element = 0, 0
    nums.each do |num|
        max_element = num if counter == 0
        counter += ((max_element == num) ? 1 : -1)
    end
    return max_element
end
