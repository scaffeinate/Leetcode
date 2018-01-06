/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if(needle.length > haystack.length) { return -1; }
    for(let i = 0; i < (haystack.length - needle.length + 1); i++) {
        let k = i, j = 0;
        while(j < needle.length) {
            if(needle[j] !== haystack[k]) {
                break;
            }
            j++; k++;
        }
        if(j == needle.length) {
            return i;
        }
    }
    return (haystack.length == 0 && needle.length == 0) ? 0 : -1;
};
