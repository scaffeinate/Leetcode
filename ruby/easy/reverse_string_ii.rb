# @param {String} s
# @param {Integer} k
# @return {String}
def reverse_str(s, k)
    i, j = 0, 0
    while j < s.length
        if((j-i+1) == (2 * k))
            reverse(s, i, (i+k-1))
            i = j+1
        end
        j += 1
    end
    reverse(s, i, [s.length-1, (i+k-1)].min)
    return s
end

def reverse(s, i, j)
    while i < j
        t = s[i]
        s[i] = s[j]
        s[j] = t
        i += 1
        j -= 1
    end
end
