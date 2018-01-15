# @param {Character[]} chars
# @return {Integer}
def compress(chars)
    return 0 if chars.length == 0
    i, j, count, c = 0, 1, 1, chars[0]
    while j < chars.length
        if(chars[j] == c)
            count += 1
        else
            chars[i] = c
            i = count > 1 ? fill_chars(i+1, count, chars) : i+1
            c = chars[j] and count = 1
        end
        j += 1
    end
    chars[i] = c
    i = count > 1 ? fill_chars(i+1, count, chars) : i+1
    return i
end

def fill_chars(i, count, chars)
    return i if count <= 0
    res = fill_chars(i, count/10, chars)
    chars[res] = (count%10).to_s
    return res+1
end
