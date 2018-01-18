/**
 * @param {number[][]} nums
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(nums, r, c) {
    let result = new Array(), temp = new Array(), k = 0;
    for(let i = 0; i < nums.length; i++) {
        for(let j = 0; j < nums[i].length; j++) {
            if(k >= c) {
                result.push(temp);
                temp = new Array();
                k = 0;
            }
            temp.push(nums[i][j]);
            k++;
        }
    }
    result.push(temp);
    return (result.length === r && result[0].length === c) ? result : nums;
};
