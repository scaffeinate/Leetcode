/**
 * @param {string[]} words
 * @param {string} word1
 * @param {string} word2
 * @return {number}
 */
var shortestDistance = function(words, word1, word2) {
    let firstPointer = -1, secondPointer = -1, minDistance = words.length;
    for(let i = 0; i < words.length; i++) {
        if(words[i] === word1) {
            firstPointer = i;
        }
        if(words[i] === word2) {
            secondPointer = i;
        }
        if(firstPointer !== -1 && secondPointer !== -1) {
            minDistance = Math.min(minDistance, Math.abs(firstPointer - secondPointer));
        }
    }
    return minDistance;
};
