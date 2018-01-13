/**
 * @param {string} s
 * @return {boolean}
 */
var canPermutePalindrome = function(s) {
    let map = new Map();
    for(let c of s) {
        if(map.get(c)) {
            map.delete(c);
        } else {
            map.set(c, true);
        }
    }
    return map.size <= 1;
};
