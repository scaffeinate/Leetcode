/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let map = new Map(), res = [];
    for(let num of nums1) {
        map.set(num, true);
    }
    for(let num of nums2) {
        if(map.get(num) !== undefined) {
            res.push(num);
            map.delete(num);
        }
    }
    return res;
};
