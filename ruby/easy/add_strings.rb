# @param {String} num1
# @param {String} num2
# @return {String}
def add_strings(num1, num2)
    i,j = num1.length-1, j = num2.length-1
    res, carry = "", 0
    while i >= 0 || j >= 0
        sum = carry
        if i >= 0
            sum += num1[i].ord - '0'.ord
            i -= 1
        end
        if j >= 0
            sum += num2[j].ord - '0'.ord
            j -= 1
        end
        res = (sum%10).to_s + res
        carry = (sum/10)
    end
    res = carry.to_s + res if carry > 0
    return res
end
