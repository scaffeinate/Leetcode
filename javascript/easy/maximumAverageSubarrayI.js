/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let maxAverage = 0, sum = 0, n = Math.min(nums.length, k);
    for(let i = 0; i < n; i++) {
        sum += nums[i];
    }
    maxAverage = (sum/n);
    for(let i = n; i < nums.length; i++) {
        sum = sum - nums[i-n] + nums[i];
        maxAverage = Math.max(maxAverage, (sum/n));
    }
    return maxAverage;
};
