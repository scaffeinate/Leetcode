/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let running = 0, maxSum = Number.MIN_SAFE_INTEGER;
    for(let num of nums) {
        running = Math.max(running + num, num);
        maxSum = Math.max(running, maxSum);
    }
    return maxSum;
};
