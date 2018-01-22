# @param {String} s
# @return {String}
def longest_palindrome(s)
    longest, x = 0, 0
    s.each_char.with_index do |c, i|
        len = get_longest_palindrome(i-1, i+1, s) + 1
        len2 = get_longest_palindrome(i, i+1, s)
        if(len > longest)
            longest = len
            x = i - (len/2)
        end
        
        if(len2 > longest)
            longest = len2
            x = i - (len2/2) + 1
        end
    end
    return s[x..(x+longest-1)]
end

def get_longest_palindrome(i, j, s)
    len = 0
    while(i >= 0 && j < s.length && s[i] == s[j])
        i -= 1
        j += 1
        len += 2
    end
    return len
end
