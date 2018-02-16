# @param {Integer[]} height
# @return {Integer}
def max_area(height)
    max_area, i, j = 0, 0, height.length-1
    while i < j
        area = [height[i], height[j]].min * (j-i)
        max_area = [max_area, area].max
        if height[i] < height[j]
            i += 1
        else
            j -= 1
        end
    end
    return max_area
end
