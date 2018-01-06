# @param {Integer[]} digits
# @return {Integer[]}
def plus_one(digits)
    i, j, carry = digits.length-1, 0, 1
    while i >= 0
        sum = digits[i] + carry
        digits[i] = (sum % 10)
        carry = (sum/10).to_i
        i -= 1
    end
    digits.unshift(carry) if carry > 0
    while j < digits.length && digits[j] == 0
        j += 1
    end
    return digits.drop(j)
end
