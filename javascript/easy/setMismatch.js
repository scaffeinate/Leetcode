/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    const res = new Array();
    for(let i = 0; i < nums.length; i++) {
        let n = Math.abs(nums[i]);
        if(nums[n-1] < 0) {
            res.push(n);
        } else {
            nums[n-1] = -nums[n-1];
        }
    }
    
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] > 0) {
            res.push(i+1);
        }
    }
    return res;
};
