/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let res = "", word = "";
    for(let i = 0; i < s.length; i++) {
        if(s[i] === ' ') {
            res += reverseWord(word) + ((i > 0 && i < s.length-1) ? ' ' : '');
            word = "";
        } else {
            word += s[i];
        }
    }
    return res + reverseWord(word);
};

var reverseWord = function(word) {
    let res = "";
    for(let i = 0; i < word.length; i++) {
        res = word[i] + res;
    }
    return res;
};
