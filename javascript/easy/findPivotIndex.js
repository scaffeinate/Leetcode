/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let sums = new Array(nums.length), sum = 0;
    for(let i = 0; i < nums.length; i++) {
        sum += nums[i];
        sums[i] = sum;
    }
    
    for(let i = 0; i < nums.length; i++) {
        const left = ((i > 0) ? sums[i-1] : 0);
        const right = ((i < nums.length-1) ? (sum - sums[i]) : 0);
        if(left === right) {
            return i;
        }
    }
    return -1;
};
