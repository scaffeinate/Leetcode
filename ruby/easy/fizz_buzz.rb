FIZZ, BUZZ, FIZZ_BUZZ = "Fizz", "Buzz", "FizzBuzz"
# @param {Integer} n
# @return {String[]}
def fizz_buzz(n)
    results = Array.new
    for i in 1..n
        if is_mod(i, 3) and is_mod(i, 5)
            results.push(FIZZ_BUZZ)
        elsif is_mod(i, 3)
            results.push(FIZZ)
        elsif is_mod(i, 5)
            results.push(BUZZ)
        else
            results.push(i.to_s)
        end
    end
    return results
end

def is_mod(i, mod)
    return ((i % mod) == 0);
end
