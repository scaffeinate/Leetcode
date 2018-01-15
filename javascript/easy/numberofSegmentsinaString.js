/**
 * @param {string} s
 * @return {number}
 */
var countSegments = function(s) {
    let count = 0, numSegments = 0;
    for(let c of s) {
        if(c !== ' ') {
            count = 1;
        } else {
            numSegments += count;
            count = 0;
        }
    }
    return numSegments + count;
};
