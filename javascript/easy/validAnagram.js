/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let map = new Map();

    for(let c of s) {
        let count = map.get(c);
        map.set(c, (count === undefined) ? 1 : count+1);
    }

    for(let c of t) {
        let count = map.get(c);
        map.set(c, (count === undefined) ? -1 : count-1);
        if(map.get(c) === 0) {
            map.delete(c);
        }
    }

    return map.size === 0;
};
