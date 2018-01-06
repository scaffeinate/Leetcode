# @param {Integer} num_rows
# @return {Integer[][]}
def generate(num_rows)
    res = []
    generate_triangle(0, num_rows, res)
    return res
end

def generate_triangle(i, num_rows, res)
    return if(i == num_rows)
    temp = [1]
    if(i > 0)
        prev = res[i-1]
        for j in 0..prev.length-1
            temp.push((j == prev.length-1) ? 1 : prev[j]+prev[j+1])
        end
    end
    res.push(temp)
    generate_triangle(i+1, num_rows, res)
end
