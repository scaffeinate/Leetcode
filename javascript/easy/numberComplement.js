/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    let res = 0, i = 0;
    while(num > 0) {
        res |= (((num & 1) === 0) ? 1 : 0) << i
        num >>>= 1; i++;
    }
    return res;
};
