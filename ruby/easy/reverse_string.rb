# @param {String} s
# @return {String}
def reverse_string(s)
    i, j = 0, s.length-1
    while i < j
        temp = s[i]
        s[i] = s[j]
        s[j] = temp
        i += 1 and j -= 1
    end
    return s
end
