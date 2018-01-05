def two_sum(nums, target)
  hash = {}
  nums.each_with_index do |num, i|
    return [hash[target - num], i] unless hash[target - num].nil?
    hash[num] = i
  end
end