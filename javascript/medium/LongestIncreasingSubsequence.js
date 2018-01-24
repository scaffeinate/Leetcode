/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    if(nums === null || nums.length === 0) return 0;
    const memo = new Array(nums.length).fill(1);
    let max = 1;
    for(let i = 0; i < nums.length; i++) {
        for(let j = i+1; j < nums.length; j++) {
            if(nums[j] > nums[i]) {
                memo[j] = Math.max(memo[j], memo[i]+1);
                max = Math.max(memo[j], max);
            }
        }
    }
    return max;
};
