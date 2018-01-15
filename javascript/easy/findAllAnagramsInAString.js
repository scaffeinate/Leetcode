/**
 * @param {string} s
 * @param {string} p
 * @return {number[]}
 */
var findAnagrams = function(s, p) {
    const res = new Array(), pCounter = new Array(26), sCounter = new Array(26);
    if(s.length < p.length) {
        return res;    
    }
    
    pCounter.fill(0); sCounter.fill(0);
    for(let i = 0; i < p.length; i++) {
        pCounter[ord(p[i])]++;
    }
    for(let i = 0; i < p.length; i++) {
        sCounter[ord(s[i])]++;
    }
    
    if(isAnagram(pCounter, sCounter)) {
        res.push(0);
    }
    
    for(let i = 1; i < (s.length - p.length + 1); i++) {
        let prevIndex = ord(s[i-1]), nextIndex = ord(s[i + p.length - 1]);
        sCounter[prevIndex]--;
        sCounter[nextIndex]++;
        if(isAnagram(pCounter, sCounter)) {
            res.push(i);
        }
    }
    
    return res;
};

var ord = function(c) {
    return c.charCodeAt(0) - 'a'.charCodeAt(0);
};

var isAnagram = function(counter, counter2) {
    for(let i = 0; i < counter.length; i++) {
        if(counter[i] !== counter2[i]) {
            return false;
        }
    }
    return true;
};
