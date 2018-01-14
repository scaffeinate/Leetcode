/**
 * @param {string} s
 * @return {string[]}
 */
var generatePossibleNextMoves = function(s) {
    const result = [];
    for(let i = 0; i < s.length-1; i++) {
        if(s[i] === '+' && s[i+1] === s[i]) {
            result.push(s.substring(0, i) + '--' + s.substring(i+2));
        }
    }
    return result;
};
