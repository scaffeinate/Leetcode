/**
 * @param {string[]} words
 * @return {boolean}
 */
var validWordSquare = function(words) {
    let maxLen = 0, columns = new Array();
    for(let word of words) {
        maxLen = Math.max(maxLen, word.length);    
    }

    for(let i = 0; i < maxLen; i++) {
        str = "";
        for(let word of words) {
            if(i < word.length) {
                str += word[i];
            }
        }
        columns.push(str);
    }
    
    for(let i = 0; i < words.length; i++) {
        if(words[i] !== columns[i]) {
            return false;
        }
    }
    
    return true;
};
