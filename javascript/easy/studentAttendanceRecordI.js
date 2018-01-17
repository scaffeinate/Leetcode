/**
 * @param {string} s
 * @return {boolean}
 */
var checkRecord = function(s) {
    let aCount = 0, lCount = 0, i = 0;
    while(i < s.length) {
        if(s[i] === 'L') {
            lCount++;
            i++; continue;
        }
        if(s[i] === 'A') {
            aCount++;
        }
        
        if(lCount > 2 || aCount > 1) {
            return false;
        }
        lCount = 0;
        i++;
    }
    return (aCount <= 1) && (lCount <= 2);
};
