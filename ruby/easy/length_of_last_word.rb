# @param {String} s
# @return {Integer}
def length_of_last_word(s)
    i = s.length-1
    count = 0
    while i >= 0 && s[i] == ' '
        i -= 1
    end
    while i >= 0 and s[i] != ' '
        count += 1
        i -= 1
    end
    return count
end
