# @param {String} s
# @return {Integer}
def count_binary_substrings(s)
    return 0 unless s
    i, count, prev_count, total_count = 1, 1, 0, 0
    c = s[0]
    while i < s.length
        if(s[i] == c)
            count += 1 and i += 1
            next
        end
        total_count += [count, prev_count].min if(prev_count > 0)
        prev_count = count
        c = s[i]
        count = 1
        i += 1
    end
    return total_count + [count, prev_count].min
end
