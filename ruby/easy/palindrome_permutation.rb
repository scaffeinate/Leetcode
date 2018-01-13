require 'set'
# @param {String} s
# @return {Boolean}
def can_permute_palindrome(s)
    set = Set.new
    s.each_char do |c|
        if set.include?(c)
            set.delete(c)
        else
            set.add(c)
        end
    end
    return set.length <= 1
end
