/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
    const rowInfo = [1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2];
    let res = [];
    for(let word of words) {
        let row = rowInfo[ord(word[0])], canBeTyped = true;
        for(let c of word) {
            if(rowInfo[ord(c)] !== row) {
                canBeTyped = false;
                break;
            }
        }
        if(canBeTyped) {
            res.push(word);
        }
    }
    return res;
};

var ord = function(c) {
    let ascii = c.charCodeAt(0);
    return (ascii >= 65 && ascii < 97) ? (ascii - 'A'.charCodeAt(0)) : (ascii - 'a'.charCodeAt(0));
};
