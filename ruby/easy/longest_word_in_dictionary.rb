# @param {String[]} words
# @return {String}
def longest_word(words)
    queue = [""]
    longest = ""
    set = Set.new
    visited = Set.new
    words.each do |word|
        set.add(word)
    end
    
    while !queue.empty?
        current = queue.shift
        visited.add(current)
        if current.length > longest.length
            longest = current
        end
        for i in 0..25
            word = current + ('a'.ord + i).chr
            if set.include?(word) && !visited.include?(word)
                queue.push(word)
            end
        end
    end
    return longest
end
