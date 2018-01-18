# @param {Integer} c
# @return {Boolean}
def judge_square_sum(c)
    sqrt = Math.sqrt(c)
    for i in 0..sqrt
        rem = (c - (i ** 2))
        return true if (Math.sqrt(rem) % 1) == 0
    end
    return false
end
