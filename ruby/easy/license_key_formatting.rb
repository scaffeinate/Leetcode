# @param {String} s
# @param {Integer} k
# @return {String}
def license_key_formatting(s, k)
    key, res = s.gsub('-', ''), ""
    return res if key.length == 0
    i = mod = (key.length % k)
    res += key[0, mod] if mod > 0
    while i < key.length
        res += (i == 0) ? "" : "-";
        res += key[i, k]
        i += k
    end
    return res.upcase
end
