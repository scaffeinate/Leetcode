/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    nums.sort(function(x,y){return x-y});
    let sum = 0;
    for(let i = 0; i < nums.length; i += 2) {
        sum += nums[i];
    }
    return sum;
};
