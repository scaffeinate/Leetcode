# @param {Integer} x
# @param {Integer} y
# @return {Integer}
def hamming_distance(x, y)
    xor = x ^ y
    hamming_distance = 0
    while xor > 0
        hamming_distance += 1 if (xor & 1) == 1
        xor >>= 1
    end
    hamming_distance
end
