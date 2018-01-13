/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length, expectedSum = parseInt(((n+1) * n)/2), sum = 0;
    for(let i = 0; i < n; i++) {
        sum += nums[i];
    }
    return expectedSum - sum;
};
