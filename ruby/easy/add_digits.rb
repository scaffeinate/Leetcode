# @param {Integer} num
# @return {Integer}
def add_digits(num)
    return num <= 9 ? num : (((num % 9) == 0) ? 9 : (num % 9))
end
