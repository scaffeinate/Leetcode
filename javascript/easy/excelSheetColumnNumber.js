/**
 * @param {string} s
 * @return {number}
 */
var titleToNumber = function(s) {
    let result = 0, factor = 1;
    for(let i = s.length-1; i >= 0; i--) {
        result += ((s[i].charCodeAt() - 'A'.charCodeAt()) + 1) * factor;
        factor *= 26;
    }
    return result;
};
