/**
 * @param {number[]} nums
 * @return {boolean}
 */
var increasingTriplet = function(nums) {
    if(nums.length < 3) return false;
    let i = 0, j = 1, min_i = Number.MAX_SAFE_INTEGER, min_j = Number.MAX_SAFE_INTEGER;
    while(j < nums.length) {
        if(nums[j] > min_j) return true;
        if(nums[j] > nums[i]) {
            min_i = Math.min(min_i, nums[i]);
            min_j = Math.min(min_j, nums[j]);
        } else {
            i = j;
        }
        j++;
    }
    return false;
};
