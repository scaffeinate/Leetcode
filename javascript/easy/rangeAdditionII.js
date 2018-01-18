/**
 * @param {number} m
 * @param {number} n
 * @param {number[][]} ops
 * @return {number}
 */
var maxCount = function(m, n, ops) {
    let minR = m, minC = n;
    for(let op of ops) {
        if(op[0] < minR) {
            minR = op[0];    
        }
        
        if(op[1] < minC) {
            minC = op[1];
        }
    }
    return minR * minC;
};
