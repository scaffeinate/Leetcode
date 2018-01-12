/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let set = {};
    for(let num of nums) {
        if(set[num] !== undefined) {
            return true;
        }
        set[num] = true;
    }
    return false;
};