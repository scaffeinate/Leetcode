/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let i = 0, j = s.length-1;
    while(i <= j) {
        if(!isChar(s[i])) {
            i++; continue;
        }

        if(!isChar(s[j])) {
            j--; continue;
        }

        if(!charEquals(s[i], s[j])) {
            return false;
        }
        i++; j--;
    }
    return true;
};

var isChar = function(c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
};

var charEquals = function(c1, c2) {
    return c1.toUpperCase() === c2.toUpperCase();
};
