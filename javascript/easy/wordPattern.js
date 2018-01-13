/**
 * @param {string} pattern
 * @param {string} str
 * @return {boolean}
 */
var wordPattern = function(pattern, str) {
    let map = new Map(), reverseMap = new Map();
    let words = str.split(" ");
    for(let i = 0; i < pattern.length; i++) {
        let c = pattern[i], word = words[i];
        if((map.get(c) !== undefined && map.get(c) !== word) ||
           (reverseMap.get(word) !== undefined && reverseMap.get(word) !== c)) {
            return false;
        }
        map.set(c, word);
        reverseMap.set(word, c);
    }
    return (pattern.length == words.length);
};
