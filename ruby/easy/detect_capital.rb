# @param {String} word
# @return {Boolean}
def detect_capital_use(word)
    for i in 0..word.length-2
        return false if (!is_caps(word[i]) && is_caps(word[i+1])) || (is_caps(word[i]) && !is_caps(word[i+1]) && i > 0)
    end
    true
end

def is_caps(c)
    return c >= 'A' && c <= 'Z';
end
