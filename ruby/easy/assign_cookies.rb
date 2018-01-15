# @param {Integer[]} g
# @param {Integer[]} s
# @return {Integer}
def find_content_children(g, s)
    g.sort!
    s.sort!
    i, j = 0, 0
    while i < g.length && j < s.length
        i += 1 if g[i] <= s[j]
        j += 1
    end
    return i
end
