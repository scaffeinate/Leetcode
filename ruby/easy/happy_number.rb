require 'set'
# @param {Integer} n
# @return {Boolean}
def is_happy(n)
    set = Set.new
    while (n != 1 && !set.include?(n))
        sum = 0
        set.add(n)
        while n > 0
            sum += ((n % 10) ** 2)
            n /= 10
        end
        n = sum
    end
    return (n == 1)
end