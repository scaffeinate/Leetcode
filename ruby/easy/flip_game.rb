# @param {String} s
# @return {String[]}
def generate_possible_next_moves(s)
    res = Array.new
    for i in 0..s.length-2
        prefix = s.slice(0, i)
        suffix = s.slice(i+2, s.length)
        res.push((prefix ? prefix : '') + '--' + (suffix ? suffix : '')) if s[i] == '+' && s[i] == s[i+1]
    end
    return res
end
