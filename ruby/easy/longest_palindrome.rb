require 'set'
# @param {String} s
# @return {Integer}
def longest_palindrome(s)
    len = 0
    set = Set.new
    s.each_char do |c|
        if set.include?(c)
            len += 2 and set.delete(c)
        else
            set.add(c)
        end
    end
    return len + ((set.length > 0) ? 1 : 0)
end
