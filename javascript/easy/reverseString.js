/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function(s) {
    let res = "", i = s.length-1;
    while(i >= 0) {
        res += s[i--];
    }
    return res;
};
