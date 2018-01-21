/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort(function(x,y){ return x-y; });
    const res = new Array();
    let num = 0, i = 0;
    while(i < nums.length) {
        if(i > 0 && nums[i] == num) {
            i++; continue;
        }
        num = nums[i];
        findPairs(nums, i+1, -num, res);
        i++;
    }
    return res;
};

var findPairs = function(nums, index, target, res) {
    let i = index, j = nums.length-1;
    while(i < j) {
        const sum = nums[i] + nums[j];
        if(sum === target) {
            res.push([-target, nums[i], nums[j]]);
            let num = nums[i], num2 = nums[j];
            while(num === nums[i]) {
                i++;
            }
            while(num2 === nums[j]) {
                j--;
            }
        } else if(sum < target) {
            i++;
        } else {
            j--;
        }
    }
};
