/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let i = 0, len = Number.MAX_SAFE_INTEGER, move = true, res = "";
    if(strs.length == 0) return res;

    for(let str of strs) {
        len = Math.min(len, str.length);
    }

    while(i < len) {
        for(let j = 0; j < strs.length; j++) {
            if(strs[j][i] !== strs[0][i]) {
                return res;
            }
        }
        res += strs[0][i];
        i++;
    }
    return res;
};