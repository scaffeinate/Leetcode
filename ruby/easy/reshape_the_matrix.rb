# @param {Integer[][]} nums
# @param {Integer} r
# @param {Integer} c
# @return {Integer[][]}
def matrix_reshape(nums, r, c)
    res, temp = [], []
    k = 0
    for i in 0..nums.length-1
        for j in 0..nums[i].length-1
            if k >= c
                res.push(temp)
                temp = []
                k = 0
            end
            temp.push(nums[i][j])
            k += 1
        end
    end
    res.push(temp)
    return (res.length == r && res[0].length == c) ? res : nums
end
