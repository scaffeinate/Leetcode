# @param {Integer} num
# @return {Boolean}
def check_perfect_number(num)
    return false if num <= 1
    sum, sqrt = 1, Math.sqrt(num)
    for i in 2..sqrt
        if (num % i) == 0 && i <= (num/i)
            sum += i + (num/i)
        end
    end
    return sum == num
end
