# @param {String[]} words
# @param {String} word1
# @param {String} word2
# @return {Integer}
def shortest_distance(words, word1, word2)
    word1_index, word2_index = nil, nil
    min_distance = words.length
    words.each_with_index do |word, i|
        word1_index = i if word == word1
        word2_index = i if word == word2
        min_distance = [min_distance, (word1_index - word2_index).abs].min if word1_index && word2_index
    end
    return min_distance
end
