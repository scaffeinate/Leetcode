# @param {String} s
# @return {String}
def reverse_words(s)
    res = word = ""
    s.each_char.with_index do |c, i|
        if(c == ' ')
            res += reverse(word)
            res += ' ' if i > 0 && i < s.length-1
            word = ""
        else
            word += c
        end
    end
    return res + reverse(word)
end

def reverse(word)
    reverse = ""
    j = word.length-1
    while(j >= 0)
        reverse += word[j]
        j -= 1
    end
    return reverse
end
