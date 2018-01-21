# @param {Integer[]} a
# @param {Integer[]} b
# @return {Integer[]}
def anagram_mappings(a, b)
    map = {}
    res = []
    b.each_with_index do |n, i|
        map[n] = i
    end
    a.each do |n|
        res.push(map[n])
    end
    return res
end
