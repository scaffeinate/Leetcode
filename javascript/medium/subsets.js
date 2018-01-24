/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    const res = new Array(), temp = new Array();
    generateSubsets(0, nums, temp, res);
    return res;
};

var generateSubsets = function(index, nums, temp, res) {
    res.push(temp.slice(0));
    for(let i = index; i < nums.length; i++) {
        temp.push(nums[i]);
        generateSubsets(i+1, nums, temp, res);
        temp.pop();
    }
};
