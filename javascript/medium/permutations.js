/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    const res = new Array();
    permutate(0, nums, res);
    return res;
};

var permutate = function(index, nums, res) {
    if(index === nums.length) {
        res.push(nums.slice(0)); return;
    }
    for(let i = index; i < nums.length; i++) {
        swap(nums, i, index);
        permutate(index+1, nums, res);
        swap(nums, index, i);
    }
};

var swap = function(nums, i, j) {
    if(i !== j) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
