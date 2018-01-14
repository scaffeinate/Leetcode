# @param {String} word
# @param {String} abbr
# @return {Boolean}
def valid_word_abbreviation(word, abbr)
    i,j = 0,0
    abbr_counter,num = 0,0
    while i < word.length && j < abbr.length
        if is_numeric(abbr[j])
            num = (num * 10) + get_number(abbr[j])
            return false if num == 0
            j += 1 and next
        end
        abbr_counter += num
        while(num > 0 && i < word.length)
            num -= 1
            i += 1
        end
        return false if i >= word.length || word[i] != abbr[j]
        i += 1 and j += 1 and abbr_counter += 1
    end
    return ((i + num) == word.length) && (j == abbr.length) && ((abbr_counter + num) == word.length)
end

def is_numeric(c)
    return c.ord >= '0'.ord && c.ord <= '9'.ord
end

def get_number(c)
    return c.ord - '0'.ord
end
