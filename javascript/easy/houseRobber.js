/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    return maxRob(0, nums, {});
};

var maxRob = function(i, nums, memo) {
    if(i >= nums.length) { 
        return 0; 
    } else if(memo[i] == null) {
        memo[i] = Math.max((nums[i] + maxRob(i+2, nums, memo)), maxRob(i+1, nums, memo));
    }
    return memo[i];
}