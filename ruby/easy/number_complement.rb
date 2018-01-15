# @param {Integer} num
# @return {Integer}
def find_complement(num)
    i, res = 0, 0
    while num > 0
        res |= (((num & 1) == 0) ? 1 : 0) << i
        num >>= 1
        i += 1
    end
    return res
end
