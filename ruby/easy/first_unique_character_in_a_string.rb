# @param {String} s
# @return {Integer}
def first_uniq_char(s)
    map = Hash.new
    s.each_char do |c|
        map[c] = map[c] ? (map[c] + 1) : 1
    end
    s.each_char.with_index do |c,i|
        return i if map[c] == 1
    end
    -1
end
