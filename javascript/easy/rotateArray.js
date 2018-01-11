/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    let n = nums.length;
    k = (k % n)
    reverse(nums, 0, n-k-1);
    reverse(nums, n-k, n-1);
    reverse(nums, 0, n-1);
};

var reverse = function(nums, start, end) {
    while(start < end) {
        nums[start] = nums[start] + nums[end]
        nums[end] = nums[start] - nums[end]
        nums[start] = nums[start] - nums[end]
        start++;
        end--;
    }
};
