/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    const map = new Map();
    let sum = 0, count = 0;
    for(let num of nums) {
        sum += num;
        if(sum === k) {
            count++;
        }
        if(map.has(sum-k)) {
            count += map.get(sum-k);
        }
        map.set(sum, map.has(sum) ? map.get(sum)+1 : 1);
    }
    return count;
};
