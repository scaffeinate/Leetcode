# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    map = {}
    i, j, longest = 0, 0, 0
    while j < s.length
        c = s[j]
        if map.has_key?(c) && map[c] >= i
            i = map[c] + 1
        end
        longest = [longest, (j-i+1)].max
        map[c] = j
        j += 1
    end
    return longest
end
