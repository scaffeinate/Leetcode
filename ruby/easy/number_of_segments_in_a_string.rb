# @param {String} s
# @return {Integer}
def count_segments(s)
    i, str = 0, ""
    arr = Array.new
    while i < s.length
        if s[i] != ' '
            str += s[i]
        else
            arr.push(str) unless str.empty?
            str = ""
        end
        i += 1
    end
    arr.push(str) unless str.empty?
    return arr.length
end
