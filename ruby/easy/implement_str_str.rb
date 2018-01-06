# @param {String} haystack
# @param {String} needle
# @return {Integer}
def str_str(haystack, needle)
    return -1 if needle.length > haystack.length
    for i in 0..(haystack.length - needle.length)
        k = i
        j = 0
        while j < needle.length
            break if needle[j] != haystack[k]
            j += 1
            k += 1
        end
        return i if j == needle.length
    end
    return -1
end
