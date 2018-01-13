# @param {Integer} num
# @return {Boolean}
def is_ugly(num)
    return false unless num > 0
    factors = [2,3,5]
    while num > 1
        prev = num
        factors.each do |factor|
            num /= factor if (num % factor) == 0
        end
        return false if prev == num
    end
    return true
end
