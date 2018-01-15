# @param {String[]} words
# @return {String[]}
def find_words(words)
    row_info = [1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2]
    res = []
    words.each do |word|
        row = row_info[ord(word[0])]
        can_be_typed = true
        word.each_char do |c|
            can_be_typed = false && break if row_info[ord(c)] != row
        end
        res.push(word) if can_be_typed
    end
    return res
end

def ord(c)
    return (c >= 'A' && c <= 'Z') ? (c.ord - 'A'.ord) : (c.ord - 'a'.ord)
end
