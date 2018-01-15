# @param {Integer[]} nums
# @return {String[]}
def find_relative_ranks(nums)
    ranks_map = Hash.new
    res = Array.new
    sorted = nums.sort.reverse
    sorted.each_with_index do |num, i|
        if i == 0
            ranks_map[num] = "Gold Medal"
        elsif i == 1
            ranks_map[num] = "Silver Medal"
        elsif i == 2
            ranks_map[num] = "Bronze Medal"
        else
            ranks_map[num] = (i+1).to_s
        end
    end

    nums.each do |num|
        res.push(ranks_map[num])
    end
    return res
end
