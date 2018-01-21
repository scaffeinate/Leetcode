/**
 * @param {number[]} nums
 * @return {number}
 */
var dominantIndex = function(nums) {
    let max = 0, maxIndex = -1;
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] > max) {
            max = nums[i];
            maxIndex = i;
        }
    }
    
    for(let num of nums) {
        if(max !== num && max < (2 * num)) {
            return -1;
        }
    }
    return maxIndex;
};
