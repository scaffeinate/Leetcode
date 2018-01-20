# @param {String[]} words1
# @param {String[]} words2
# @param {string[][]} pairs
# @return {Boolean}
def are_sentences_similar(words1, words2, pairs)
    return false if words1.length != words2.length
    dict = {}
    pairs.each do |pair|
        w1, w2 = pair[0], pair[1]
        dict[w1] = Set.new if(!dict[w1])
        dict[w1].add(w2)
    end
    
    for i in 0..words1.length-1
        w1 = words1[i]
        w2 = words2[i]
        if(!((w1 == w2) || (dict[w1] && dict[w1].include?(w2)) || (dict[w2] && dict[w2].include?(w1))))
            return false
        end
    end
    return true
end
