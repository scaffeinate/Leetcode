/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = new Map(), res = new Array();
    for(let str of strs) {
        let key = str.split('').sort().join('');
        if(!map.has(key)) {
            map.set(key, new Array());
        }
        map.get(key).push(str);
    }
    map.forEach(function(v, k, map){
        res.push(v);
    });
    return res;
};
