/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    for(let i = 0; i < word.length-1; i++) {
        if((!isCaps(word[i]) && isCaps(word[i+1])) || (isCaps(word[i]) && !isCaps(word[i+1]) && i > 0)) {
            return false;
        }
    }
    return true;
};

var isCaps = function(c) {
    return c.charCodeAt(0) >= 65 && c.charCodeAt(0) < 97;    
};
