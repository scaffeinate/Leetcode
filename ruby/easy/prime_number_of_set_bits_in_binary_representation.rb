# @param {Integer} l
# @param {Integer} r
# @return {Integer}
def count_prime_set_bits(l, r)
    primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
    set = Set.new
    primes.each { |p| set.add(p) } 
    total_count = 0
    while(l <= r)
        num, count = l, 0
        while(num > 0)
            count += 1 if ((num & 1) == 1)
            num >>= 1
        end
        total_count += 1 if set.include?(count)
        l += 1
    end
    return total_count
end
