# @param {Integer} m
# @param {Integer} n
# @param {Integer[][]} ops
# @return {Integer}
def max_count(m, n, ops)
    min_r = m
    min_c = n
    ops.each do |op|
        min_r = [min_r, op[0]].min
        min_c = [min_c, op[1]].min
    end
    return min_r * min_c
end
