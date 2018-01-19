/**
 * @param {number[]} nums
 * @return {number}
 */
var findLengthOfLCIS = function(nums) {
    let lcis = 0, i = 0, count = 0;
    while(i < nums.length) {
        if(i === 0 || nums[i] > nums[i-1]) {
            count++;
        } else {
            count = 1;
        }
        lcis = Math.max(count, lcis);
        i++;
    }
    return lcis;
};
