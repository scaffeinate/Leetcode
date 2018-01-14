/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    const map = new Map();
    for(let c of ransomNote) {
        let count = map.get(c); 
        map.set(c, ((count === undefined) ? 1 : count+1));
    }
    
    for(let c of magazine) {
        let count = map.get(c);
        if(count !== undefined) {
            if(count === 1) {
                map.delete(c);
            } else {
                map.set(c, count-1);
            }
        }
    }
    
    return map.size === 0;
};
