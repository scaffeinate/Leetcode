/**
 * @param {number} c
 * @return {boolean}
 */
var judgeSquareSum = function(c) {
    let sqrt = parseInt(Math.sqrt(c));
    for(let i = 0; i <= sqrt; i++) {
        let rem = (c - (i * i));
        if((Math.sqrt(rem) % 1) === 0) {
            return true;
        }
    }
    return false;
};
