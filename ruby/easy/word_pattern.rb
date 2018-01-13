# @param {String} pattern
# @param {String} str
# @return {Boolean}
def word_pattern(pattern, str)
    map, reverse_map = {}, {}
    words = str.split(" ")
    i = 0
    pattern.each_char do |c|
        word = words[i]
        return false if (map[c] && map[c] != word) || (reverse_map[word] && reverse_map[word] != c)
        map[c] = word
        reverse_map[word] = c
        i += 1
    end
    return pattern.length == words.length
end
