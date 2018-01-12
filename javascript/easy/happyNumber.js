/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    let set = {};
    while(n != 1 && set[n] == null) {
        let sum = 0;
        set[n] = 1;
        while(n > 0) {
            sum += Math.pow((n%10), 2);    
            n = parseInt(n/10);
        }
        n = sum;
    }
    return (n == 1);
};