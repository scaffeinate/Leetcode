# @param {Integer} n
# @return {String[]}
def generate_parenthesis(n)
    res = Array.new
    generate(0, 0, n, "", res)
    return res
end

def generate(open, closed, n, str, res)
    if(open == n && closed == n)
        res.push(str) if str.length > 0
        return
    end
    if(open < n)
        generate(open+1, closed, n, str + '(', res)
    end
    if(closed < open)
        generate(open, closed+1, n, str + ')', res)
    end
end
