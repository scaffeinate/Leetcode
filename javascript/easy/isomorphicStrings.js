/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let map = {}, reverseMap = {};
    for(let i = 0; i < s.length; i++) {
        let c1 = s[i], c2= t[i];
        if((map[c1] !== undefined && map[c1] !== c2) || (reverseMap[c2] !== undefined && reverseMap[c2] !== c1)) {
           return false;
        }
        map[c1] = c2;
        reverseMap[c2] = c1;
    }
    return true;
};