# @param {Integer} left
# @param {Integer} right
# @return {Integer[]}
def self_dividing_numbers(left, right)
    res = []
    while(left <= right)
        res.push(left) if is_self_dividing(left)
        left += 1
    end
    return res
end

def is_self_dividing(num)
    x = num
    while x > 0
        d = (x % 10)
        return false if (d == 0) || ((num % d) != 0)
        x /= 10
    end
    return true
end
