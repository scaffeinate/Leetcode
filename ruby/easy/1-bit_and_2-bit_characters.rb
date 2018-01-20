# @param {Integer[]} bits
# @return {Boolean}
def is_one_bit_character(bits)
    return false if bits.length == 0
    onebit = false
    i = 0;
    while i < bits.length
        if(bits[i] == 1)
            onebit = false
            i += 1
        else
            onebit = true
        end
        i += 1
    end
    return onebit
end
