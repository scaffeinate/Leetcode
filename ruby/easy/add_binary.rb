# @param {String} a
# @param {String} b
# @return {String}
def add_binary(a, b)
    i, j, carry = a.length-1, b.length-1, 0
    obj = { sum: 0, carry: 0, str: "" }
    while i >= 0 and j >= 0
        add_to_str(obj, (a[i].ord - '0'.ord) + (b[j].ord - '0'.ord))
        i -= 1
        j -= 1
    end

    while i >= 0
        add_to_str(obj, a[i].ord - '0'.ord)
        i -= 1
    end

    while j >= 0
        add_to_str(obj, b[j].ord - '0'.ord)
        j -= 1
    end

    add_to_str(obj, 0) if obj[:carry] > 0
    return obj[:str]
end

def add_to_str(obj, sum)
    obj[:sum] = sum + obj[:carry]
    obj[:carry] = (obj[:sum] > 1) ? 1 : 0
    obj[:str] = (((obj[:sum] % 2) != 0) ? "1" : "0") + obj[:str];
end
