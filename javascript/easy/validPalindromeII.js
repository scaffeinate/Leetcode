/**
 * @param {string} s
 * @return {boolean}
 */
var validPalindrome = function(s) {
    return isPalindrome(s, 0, s.length-1, 0);
};

var isPalindrome = function(s, i, j, count) {
    if(i >= j) return true;
    if(s[i] === s[j]) {
        return isPalindrome(s, i+1, j-1, count);
    } else {
        return (count < 1) && (isPalindrome(s, i+1, j, count+1) || isPalindrome(s, i, j-1, count+1));
    }
};
