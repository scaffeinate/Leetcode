/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumProduct = function(nums) {
    nums.sort(function(x,y){return x-y});
    return Math.max((nums[0] * nums[1] * nums[nums.length-1]), 
                    (nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]));
};
