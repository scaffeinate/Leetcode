# @param {String} s
# @param {String} p
# @return {Integer[]}
def find_anagrams(s, p)
    return [] if s.length < p.length
    s_counter, p_counter, res = Array.new(26), Array.new(26), Array.new
    s_counter.fill(0)
    p_counter.fill(0)
    p.each_char do |c|
        p_counter[c.ord - 'a'.ord] += 1
    end
    for i in 0..p.length-1
        s_counter[s[i].ord - 'a'.ord] += 1
    end
    res.push(0) if is_anagram(p_counter, s_counter)
    
    for i in 1..s.length-p.length
        prev_c = s[i-1].ord - 'a'.ord
        c = s[i + p.length - 1].ord - 'a'.ord
        s_counter[prev_c] -= 1
        s_counter[c] += 1
        res.push(i) if is_anagram(p_counter, s_counter)
    end
    
    return res
end

def is_anagram(counter1, counter2)
    for i in 0..counter1.length-1
        return false if counter1[i] != counter2[i]
    end
    return true
end
