# @param {Integer} n, a positive integer
# @return {Integer}
def reverse_bits(n)
    return reverse(0, n, { mul: 1 })
end

def reverse(i, n, obj)
    return 0 if i >= 32
    res = reverse(i+1, n >> 1, obj) + (((n & 1) != 0) ? obj[:mul] : 0)
    obj[:mul] *= 2
    return res
end