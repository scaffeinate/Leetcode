# @param {String} s
# @return {Boolean}
def valid_palindrome(s)
    return is_palindrome(s, 0, s.length-1, 0)
end

def is_palindrome(s, i, j, count)
    return true if (i >= j)
    if(s[i] == s[j])
        return is_palindrome(s, i+1, j-1, count)
    else
        return (count < 1) && (is_palindrome(s, i+1, j, count+1) || is_palindrome(s, i, j-1, count+1))
    end
end
