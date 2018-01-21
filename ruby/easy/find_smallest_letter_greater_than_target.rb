# @param {Character[]} letters
# @param {Character} target
# @return {Character}
def next_greatest_letter(letters, target)
    start, stop = 0, letters.length-1
    while start <= stop
        middle = (start+stop)/2
        if(letters[middle].ord > target.ord)
            stop = middle-1
        else
            start = middle+1
        end
    end
    return (start >= letters.length) ? (letters[0]) : letters[start]
end
