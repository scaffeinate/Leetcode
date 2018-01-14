# @param {String} s
# @return {String}
def reverse_vowels(s)
    i,j = 0,s.length-1
    while i < j
        if is_vowel(s[i]) && is_vowel(s[j])
            t = s[i]
            s[i] = s[j]
            s[j] = t
            i += 1 and j -= 1
        elsif is_vowel(s[i])
            j -= 1
        elsif is_vowel(s[j])
            i += 1
        else
            i += 1 and j -= 1
        end
    end
    return s
end

def is_vowel(c)
    return "aeiouAEIOU".index(c)
end
