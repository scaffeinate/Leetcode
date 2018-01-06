/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let start = 0, end = nums.length-1;
    while(start <= end) {
        let middle = parseInt((start+end)/2);
        if(nums[middle] == target) {
            return middle;
        } else if(nums[middle] > target) {
            end = middle-1;
        } else {
            start = middle+1;
        }
    }
    return end+1;
};
