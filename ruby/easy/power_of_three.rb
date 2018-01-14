# @param {Integer} n
# @return {Boolean}
def is_power_of_three(n)
    return n > 0 && (((3 ** 27) % n) == 0);
end
