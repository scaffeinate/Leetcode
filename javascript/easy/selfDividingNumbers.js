/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function(left, right) {
    const res = new Array();
    while(left <= right) {
        if(isSelfDividing(left)) {
            res.push(left);
        }
        left++;
    }
    return res;
};

var isSelfDividing = function(num) {
    let x = num;
    while(x > 0) {
        let digit = (x % 10);
        if(digit == 0 || (num % digit) != 0) {
            return false;
        }
        x = parseInt(x/10);
    }
    return true;
};
