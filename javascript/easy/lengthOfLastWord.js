/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let count = 0, i = s.length-1;
    while(i >= 0 && s[i] === ' ') i--;
    while(i >= 0 && s[i] !== ' ') { count++; i--; }
    return count;
};
