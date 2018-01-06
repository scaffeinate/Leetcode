/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let carry = plusOneRecursive(0, digits), i = 0;
    if(carry > 0) {
        digits.unshift(carry);
    }
    while(i < digits.length && digits[i] == 0) {
        i++;
    }
    return digits.slice(i, digits.length);
};

var plusOneRecursive = function(i, digits) {
    if(i == digits.length) return 1;
    let sum = digits[i] + plusOneRecursive(i+1, digits);
    digits[i] = (sum%10);
    return parseInt(sum/10);
};
