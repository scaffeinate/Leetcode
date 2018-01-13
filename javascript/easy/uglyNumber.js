/**
 * @param {number} num
 * @return {boolean}
 */
var isUgly = function(num) {
    if(num <= 0) return false;
    let factors = [2,3,5];
    while(num > 1) {
        let temp = num;
        for(let factor of factors) {
            if((num % factor) == 0) {
                num = parseInt(num/factor);
            }
        }
        if(num === temp) {
            return false;
        }
    }
    return true;
};
