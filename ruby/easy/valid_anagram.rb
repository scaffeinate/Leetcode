# @param {String} s
# @param {String} t
# @return {Boolean}
def is_anagram(s, t)
    set = Array.new
    26.times do |i|
        set[i] = 0
    end
    s.each_char do |c|
        set[(c.ord - 97)] += 1
    end
    t.each_char do |c|
        set[(c.ord - 97)] -= 1
    end
    set.each do |val|
        return false if val != 0
    end
    return true
end
