# @param {Integer} num
# @return {Boolean}
def is_power_of_four(num)
    return num > 0 && ((num & num-1) == 0) && ((num-1) % 3) == 0;
end
