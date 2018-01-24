/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let j = nums.length-1, i = j-1;
    while(i >= 0) {
        if((i + nums[i]) >= j) {
            j = i;
        }
        i--;
    }
    return j === 0;
};
