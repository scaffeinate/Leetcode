/**
 * @param {number} length
 * @param {number[][]} updates
 * @return {number[]}
 */
var getModifiedArray = function(length, updates) {
    const res = new Array(length).fill(0);
    for(let update of updates) {
        const i = update[0], j = update[1], val = update[2];
        res[i] += val;
        if(j < length-1) {
            res[j+1] -= val;    
        }
    }
    for(let i = 0, sum = 0; i < res.length; i++) {
        sum += res[i];
        res[i] = sum;
    }
    return res;
};
