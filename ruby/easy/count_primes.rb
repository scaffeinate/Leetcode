# @param {Integer} n
# @return {Integer}
def count_primes(n)
    arr = []
    sqrt = Math.sqrt(n).to_i
    count = 0
    for i in 2..sqrt
        next if arr[i-2] == 1
        mul = 2
        while (j = (i * mul)) <= n
            mul += 1
            arr[j-2] = 1
        end
    end
    for i in 2..n-1
        count += 1 if arr[i-2].nil?
    end
    return count
end