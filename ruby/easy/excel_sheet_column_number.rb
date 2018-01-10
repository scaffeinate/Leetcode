# @param {String} s
# @return {Integer}
def title_to_number(s)
    res, fact = 0, 26
    s.each_char do |c|
        res += (c.ord - 'A'.ord + 1) * fact
        fact * 26
    end
    return res
end
