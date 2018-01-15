/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    let i = num1.length - 1, j = num2.length - 1, res = "", carry = 0;
    while(i >= 0 || j >= 0) {
        let sum = carry;
        if(i >= 0) {
            sum += getNumber(num1[i]);
            i--;
        }
        if(j >= 0) {
            sum += getNumber(num2[j]);
            j--;
        }
        res = (sum % 10) + res;
        carry = parseInt(sum/10);
    }
    
    if(carry > 0) {
        res = (carry + res);
    }
    
    return res;
};

var getNumber = function(c) {
    return c.charCodeAt(0) - '0'.charCodeAt(0);    
};
