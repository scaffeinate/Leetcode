# @param {Integer} num
# @return {Boolean}
def is_perfect_square(num)
    start, stop = 1, num
    while start <= stop
        middle = (start + stop)/2
        square = middle * middle
        if(square == num)
            return true
        elsif(square > num)
            stop = middle-1
        else
            start = middle+1
        end
    end
    return false
end
