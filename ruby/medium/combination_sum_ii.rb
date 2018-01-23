# @param {Integer[]} candidates
# @param {Integer} target
# @return {Integer[][]}
def combination_sum2(candidates, target)
    res, temp, entries = [], [], []
    map = {}
    candidates.each do |c|
        map[c] = 0 unless map.has_key?(c)
        map[c] += 1
    end
    map.each do |k,v|
        entries.push([k, v])
    end
    generate_combination_sum(0, target, entries, temp, res)
    return res
end

def generate_combination_sum(index, target, entries, temp, res)
    if(target == 0)
        res.push(temp.clone)
    elsif(target > 0)
       for i in index..entries.length-1
           entry = entries[i]
           if(entry[1] > 0)
               temp.push(entry[0])
               entry[1] -= 1
               generate_combination_sum(i, (target-entry[0]), entries, temp, res)
               entry[1] += 1
               temp.pop
           end
       end
    end
end
