# @param {String} digits
# @return {String[]}
def letter_combinations(digits)
    map = { 2 => ['a', 'b', 'c'], 3 => ['d', 'e', 'f'], 4 => ['g', 'h', 'i'], 
            5 => ['j', 'k', 'l'], 6 => ['m', 'n', 'o'], 7 => ['p', 'q', 'r', 's'], 
            8 => ['t', 'u', 'v'],
            9 => ['w', 'x', 'y', 'z'], 0 => [' '] }
    res = []
    get_combinations(0, digits, "", map, res)
    return res
end

def get_combinations(index, digits, str, map, res)
    if(index == digits.length)
        res.push(str) if str.length > 0
        return
    end
    chars = map[digits[index].to_i]
    chars.each do |c|
        get_combinations(index+1, digits, str+c, map, res)
    end
end
