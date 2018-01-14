# @param {String} s
# @param {String} t
# @return {Character}
def find_the_difference(s, t)
    map = Hash.new
    t.each_char do |c|
        map[c] = map[c] ? map[c]+1 : 1
    end
    s.each_char do |c|
        return c unless map[c]
        map[c] = map[c]-1
    end
    map.each do |k,v|
        return k if v == 1
    end
end
