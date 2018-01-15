# @param {Integer} num
# @return {String}
def convert_to_base7(num)
    return "0" if num == 0
    abs = num.abs
    res = ""
    while abs > 0
        res = (abs % 7).to_s + res
        abs /= 7
    end
    return (num < 0) ? ("-" + res) : res
end
