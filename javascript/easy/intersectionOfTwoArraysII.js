/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    const map = new Map();
    let res = [];
    for(let num of nums1) {
        let count = map.get(num);
        map.set(num, (count === undefined) ? 1 : count+1);
    }
    for(let num of nums2) {
        let count = map.get(num);
        if(count !== undefined) {
            res.push(num);
            if(count == 1) {
                map.delete(num);
            } else {
                map.set(num, count-1);
            }
        }
    }
    return res;
};
