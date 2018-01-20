# @param {String[]} ops
# @return {Integer}
def cal_points(ops)
    stack = Array.new
    sum = 0
    ops.each do |op|
        if(op == "C")
            stack.pop
        elsif(op == "D")
            stack.push(stack.last * 2)
        elsif(op == "+")
            stack.push(stack.last + stack[stack.length-2])
        else
            stack.push(op.to_i)
        end
    end
    
    while !stack.empty?
        sum += stack.pop
    end
    return sum
end
