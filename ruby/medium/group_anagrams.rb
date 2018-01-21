# @param {String[]} strs
# @return {String[][]}
def group_anagrams(strs)
    map = {}
    res = []
    strs.each do |str|
        key = str.chars.sort.join
        if !map.has_key?(key)
            map[key] = Array.new
        end
        map[key].push(str)
    end
    map.each do |k,v|
        res.push(v)
    end
    return res
end
