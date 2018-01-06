# @param {Integer} x
# @return {Integer}
def my_sqrt(x)
    return bs(1, x, x);
end

def bs(min, max, x)
    return min - 1 if min > max
    middle = (min + max)/2;
    sqr = middle * middle;
    if(sqr == x)
        return middle
    elsif(sqr > x)
        return bs(min, middle-1, x)
    else
        return bs(middle+1, max, x)
    end
end
