# @param {Integer[]} nums
# @return {Integer}
def find_shortest_sub_array(nums)
    max_freq, shortest_distance = 0, nums.length
    freq_map, indexes_map = Hash.new, Hash.new
    nums.each_with_index do |num, i|
        freq = freq_map[num] ? freq_map[num]+1 : 1
        freq_map[num] = freq
        max_freq = [max_freq, freq].max
        if indexes_map[num]
            arr = indexes_map[num]
            arr[0] = [arr[0], i].min
            arr[1] = [arr[1], i].max
        else
            indexes_map[num] = [i, i]
        end
    end
    nums.each do |num|
        if freq_map[num] == max_freq
            arr = indexes_map[num]
            shortest_distance = [shortest_distance, (arr[1] - arr[0] + 1)].min
        end
    end
    
    return shortest_distance
end
