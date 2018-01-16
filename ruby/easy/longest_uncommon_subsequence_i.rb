# @param {String} a
# @param {String} b
# @return {Integer}
def find_lu_slength(a, b)
    return a == b ? -1 : [a.length, b.length].max
end
