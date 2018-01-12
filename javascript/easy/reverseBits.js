/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function(n) {
    let stack = [], i = 0, res = 0, mul = 1;
    while(i < 32) {
        stack.push(((n & 1) != 0) ? 1 : 0);
        n >>= 1;
        i++;
    } 
    
    while(stack.length > 0) {
        res = res + (stack.pop() * mul);
        mul *= 2;
    }    
    
    return res;
};