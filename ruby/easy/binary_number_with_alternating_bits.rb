# @param {Integer} n
# @return {Boolean}
def has_alternating_bits(n)
    prev = -1
    while n > 0
        return false if prev == (n & 1)
        prev = (n & 1)
        n >>= 1
    end
    return true
end
