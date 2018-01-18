/**
 * @param {string} s
 * @return {number}
 */
var countBinarySubstrings = function(s) {
    if(s.length === 0) return 0;
    let count = 1, totalCount = 0, prevCount = 0, c = s[0], i = 1;
    while(i < s.length) {
        if(s[i] === c) {
            count++;
            i++; continue;
        }
        if(prevCount > 0) {
            totalCount += Math.min(prevCount, count);
        }
        c = s[i];
        prevCount = count;
        count = 1;
        i++;
    }
    return totalCount + Math.min(prevCount, count);
};
