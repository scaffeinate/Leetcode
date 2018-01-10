# @param {Integer} n
# @return {String}
def convert_to_title(n)
    return ('A'.ord + n - 1).chr if n <= 26
    mod = (n % 26)
    div = (mod == 0) ? ((n/26).to_i - 1) : (n / 26).to_i
    return convert_to_title(div) + ((mod == 0) ? 'Z' : ('A'.ord + mod - 1).chr)
end
