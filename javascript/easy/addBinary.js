/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let i = a.length-1, j = b.length-1, obj = { sum: 0, carry: 0, str: "" };
    while(i >= 0 && j >= 0) {
        addToStr(obj, (a[i] - '0') + (b[j] - '0'));
        i--; j--;
    }
    while(i >= 0) {
        addToStr(obj, (a[i] - '0'));
        i--;
    }
    while(j >= 0) {
        addToStr(obj, (b[j] - '0'));
        j--;
    }
    if(obj.carry > 0) {
        addToStr(obj, 0);
    }
    return obj.str;
};

var addToStr = function(obj, val) {
    let sum = (val + obj.carry);
    obj.carry = (sum > 1) ? 1 : 0;
    obj.str = ((sum % 2) != 0 ? "1" : "0") + obj.str;
};
