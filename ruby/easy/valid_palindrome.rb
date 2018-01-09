# @param {String} s
# @return {Boolean}
def is_palindrome(s)
    i,j = 0,s.length-1
    while i <= j
        i += 1 and next unless is_char(s[i])
        j -= 1 and next unless is_char(s[j])

        return false unless char_equals(s[i], s[j])
        i += 1 and j -= 1
    end
    return true
end

def is_char(c)
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')
end

def char_equals(c1, c2)
    return c1.upcase == c2.upcase
end
