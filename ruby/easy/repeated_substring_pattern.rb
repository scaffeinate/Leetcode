# @param {String} s
# @return {Boolean}
def repeated_substring_pattern(s)
    len = 1
    while len <= s.length/2
        if((s.length % len) == 0)
            i, j = 0, len
            while j < s.length
                break if(s[i] != s[j])
                i += 1 and j += 1
            end
            return true if j == s.length
        end
        len += 1
    end
    return false
end
