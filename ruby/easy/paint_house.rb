# @param {Integer[][]} costs
# @return {Integer}
def min_cost(costs)
    return 0 unless !costs.empty?
    prev_red, prev_blue, prev_green = costs[0][0], costs[0][1], costs[0][2]
    for i in 1..costs.length-1
        red = [prev_blue, prev_green].min + costs[i][0]
        blue = [prev_red, prev_green].min + costs[i][1]
        green = [prev_red, prev_blue].min + costs[i][2]
        prev_red, prev_blue, prev_green = red, blue, green
    end
    return [prev_red, prev_blue, prev_green].min
end
