/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let startIndex = 0, longestLen = 0;
    for(let i = 0; i < s.length; i++) {
        let len = 1 + expand(i-1, i+1, s);
        let len2 = expand(i, i+1, s);
        if(len > longestLen) {
            longestLen = len;
            startIndex = (i - parseInt(len/2));
        }
        
        if(len2 > longestLen) {
            longestLen = len2;
            startIndex = (i - parseInt(len2/2) + 1);
        }
    }
    return s.substr(startIndex, longestLen);
};

var expand = function(i, j, s) {
    let len = 0;
    while(i >= 0 && j < s.length && s[i] === s[j]) {
        i--; j++;
        len += 2;
    }
    return len;
};
