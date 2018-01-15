# @param {Integer} area
# @return {Integer[]}
def construct_rectangle(area)
    sqrt, min, min_pair = Math.sqrt(area), area, [1,area]
    for i in 1..sqrt
        if (area % i) == 0
            div = (area/i)
            if (i - div).abs < min
                min = (i - div).abs
                min_pair = [[i, div].max, [i,div].min]
            end
        end
    end
    return min_pair
end
