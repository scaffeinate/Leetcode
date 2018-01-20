/**
 * @param {string[]} words1
 * @param {string[]} words2
 * @param {string[][]} pairs
 * @return {boolean}
 */
var areSentencesSimilar = function(words1, words2, pairs) {
    if(words1.length !== words2.length) return false;
    const map = new Map();
    for(let pair of pairs) {
        const w1 = pair[0], w2 = pair[1];
        if(!map.has(w1)) {
            map.set(w1, new Set());
        }
        map.get(w1).add(w2);
    }
    
    for(let i = 0; i < words1.length; i++) {
        const w1 = words1[i], w2 = words2[i];
        if((w1 === w2) || (map.has(w1) && map.get(w1).has(w2)) || (map.has(w2) && map.get(w2).has(w1))) {
            continue;
        } else {
            return false;
        }
    }
    return true;
};
