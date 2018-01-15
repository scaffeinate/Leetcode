# @param {String[]} words
# @return {Boolean}
def valid_word_square(words)
    columns = Array.new
    max_len = 0
    for i in 0..words.length-1
        max_len = [max_len, words[i].length].max
    end
    
    for j in 0..max_len-1
        str = ""
        words.each do |word|
            str += word[j] if j < word.length
        end
        columns.push(str)
    end
    
    for i in 0..words.length-1
        return false if words[i] != columns[i]
    end
    return true
end
