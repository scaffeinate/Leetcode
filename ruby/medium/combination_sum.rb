# @param {Integer[]} candidates
# @param {Integer} target
# @return {Integer[][]}
def combination_sum(candidates, target)
    res = Array.new
    temp = Array.new
    generate_combination_sum(0, target, candidates, temp, res)
    return res
end

def generate_combination_sum(index, target, candidates, temp, res)
    if(target == 0)
        res.push(temp.clone)
    elsif(target > 0)
        i = index
        while i < candidates.length
            temp.push(candidates[i])
            generate_combination_sum(i, (target - candidates[i]), candidates, temp, res)
            temp.pop
            i += 1
        end
    end
end
