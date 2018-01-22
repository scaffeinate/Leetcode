/**
 * @param {number[]} nums
 * @param {number} lower
 * @param {number} upper
 * @return {string[]}
 */
var findMissingRanges = function(nums, lower, upper) {
    const res = new Array();
    if(nums.length === 0) {
        addMissingRanges(lower, upper, res);
    } else {
        addMissingRanges(lower, nums[0]-1, res);
        for(let i = 1; i < nums.length; i++) {
            addMissingRanges(nums[i-1]+1, nums[i]-1, res);
        }
        addMissingRanges(nums[nums.length-1]+1, upper, res);
    }
    return res;
};

var addMissingRanges = function(lower, upper, res) {
    if(lower <= upper) {
        const diff = (upper - lower);
        str = lower.toString();
        if(diff > 0) {
            str += ("->" + upper.toString());
        }
        res.push(str);
    }    
};
