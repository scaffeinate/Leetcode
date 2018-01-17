# @param {String} s
# @return {Boolean}
def check_record(s)
    i, a_count, l_count = 0, 0, 0
    while i < s.length
        if s[i] == 'L'
            l_count += 1
            i += 1 and next
        elsif s[i] == 'A'
            a_count += 1
        end
        return false if l_count > 2 || a_count > 1
        l_count = 0
        i += 1
    end
    return l_count <= 2 && a_count <= 1
end
