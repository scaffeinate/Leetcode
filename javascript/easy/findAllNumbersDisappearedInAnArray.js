/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    const res = new Array();
    for(let num of nums) {
        let index = Math.abs(num) - 1;
        if(nums[index] > 0) {
            nums[index] = -nums[index];
        }
    }
    
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] > 0) {
            res.push(i+1);
        }
    }
    return res;
};
