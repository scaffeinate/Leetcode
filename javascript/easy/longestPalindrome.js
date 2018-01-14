/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    let map = new Map(), len = 0;
    for(let c of s) {
        let count = map.get(c);
        if(count === undefined) {
            map.set(c, 1);
        } else {
            len += 2;
            map.delete(c);
        }
    }
    return len + ((map.size > 0) ? 1 : 0);
};
