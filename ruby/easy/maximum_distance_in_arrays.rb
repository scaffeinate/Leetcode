# @param {Integer[][]} arrays
# @return {Integer}
def max_distance(arrays)
    min = arrays[0].first
    max = arrays[0].last
    max_distance = 0
    for i in 1..arrays.length-1
        a_min = arrays[i].first
        a_max = arrays[i].last
        max_distance = [max_distance, (a_max - min).abs, (max - a_min).abs].max
        min = [a_min, min].min
        max = [a_max, max].max
    end
    return max_distance
end
