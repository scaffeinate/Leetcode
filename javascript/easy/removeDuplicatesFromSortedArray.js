/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i = 0, j = 0;
    for(j = 0; j < nums.length; j++) {
        if(nums[i] != nums[j]) {
            nums[++i] = nums[j];
        }
    }
    return (nums.length == 0) ? 0 : (i+1);
};