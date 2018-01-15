/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let maxConsecutiveOnes = 0, count = 0;
    for(let num of nums) {
        if(num === 1) {
            count++;
        } else {
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
            count = 0;
        }
    }
    return Math.max(maxConsecutiveOnes, count);
};
