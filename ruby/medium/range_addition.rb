# @param {Integer} length
# @param {Integer[][]} updates
# @return {Integer[]}
def get_modified_array(length, updates)
    res = Array.new(length).fill(0)
    updates.each do |u|
        i, j, val = u[0], u[1], u[2]
        res[i] += val
        res[j+1] -= val if j < length-1
    end
    sum = 0
    res.each_with_index do |n, i|
        sum += n
        res[i] = sum
    end
    return res
end
