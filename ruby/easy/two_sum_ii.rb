# @param {Integer[]} numbers
# @param {Integer} target
# @return {Integer[]}
def two_sum(numbers, target)
    i, j = 0, numbers.length-1
    while i < j
        sum = numbers[i] + numbers[j]
        if(sum == target)
            return [i+1, j+1];
        elsif(sum > target)
            j -= 1
        else
            i += 1
        end
    end
    []
end
