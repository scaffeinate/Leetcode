# @param {Integer} n
# @return {String}
def count_and_say(n)
    return count_and_say_recursive(1, n, "1")
end

def count_and_say_recursive(index, n, str)
    return str if (index == n)
    i, count = 0, 1
    res = ""
    while i < str.length-1
        if str[i] == str[i+1]
            count += 1
        else
            res += "#{count}#{str[i]}"
            count = 1
        end
        i += 1
    end
    res += "#{count}#{str[i]}"
    return count_and_say_recursive(index+1, n, res)
end
