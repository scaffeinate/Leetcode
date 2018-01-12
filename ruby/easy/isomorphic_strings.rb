# @param {String} s
# @param {String} t
# @return {Boolean}
def is_isomorphic(s, t)
    map, reverse_map = {}, {}
    for i in 0..s.length-1
        c1, c2= s[i].to_sym, t[i].to_sym
        return false if((!map[c1].nil? && map[c1] != c2) || (!reverse_map[c2].nil? && reverse_map[c2] != c1))
        map[c1] = c2
        reverse_map[c2] = c1
    end
    true
end