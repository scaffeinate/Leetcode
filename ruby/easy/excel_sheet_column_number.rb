# @param {String} s
# @return {Integer}
def title_to_number(s)
    i, res, fact = s.length-1, 0, 1
    while i >= 0
        c = s[i]
        res += ((c.ord - 'A'.ord + 1) * fact)
        fact *= 26
        i -= 1
    end
    return res
end
