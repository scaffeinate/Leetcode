/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
    return n > 0 && (Math.pow(3, 27) % n) === 0;
};
