/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maxSubArrayLen = function(nums, k) {
    let maxLen = 0, sum = 0, map = new Map();
    for(let i = 0; i < nums.length; i++) {
        sum += nums[i];
        if(sum === k) {
            maxLen = Math.max(maxLen, (i+1));
        } else if(map.has(sum - k)) {
            maxLen = Math.max(maxLen, (i - map.get(sum-k)));
        }
        if(!map.has(sum)) {
            map.set(sum, i);    
        }
    }
    return maxLen;
};
