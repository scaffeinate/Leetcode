/**
 * @param {string} s
 * @return {boolean}
 */
var repeatedSubstringPattern = function(s) {
    let len = 1;
    while(len <= parseInt(s.length/2)) {
        if((s.length % len) === 0) {
            let i = 0, j = i+len, repeats = true;
            while(j < s.length) {
                if(s[i] !== s[j]) {
                    repeats = false;
                    break;
                }
                i++; j++;
            }
            if(repeats) {
                return true;
            }
        }
        len++;
    }
    return false;
};
