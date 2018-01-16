/**
 * @param {number} num
 * @return {boolean}
 */
var checkPerfectNumber = function(num) {
    if(num <= 1) return false;
    let sum = 1, sqrt = parseInt(Math.sqrt(num));
    for(let i = 2; i <= sqrt; i++) {
        if((num % i) === 0) {
            let div = parseInt(num/i);
            if(i <= div) {
                sum += (i + div);
            }
        }
    }
    return sum === num;
};
