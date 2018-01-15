/**
 * @param {number} num
 * @return {string}
 */
var convertToBase7 = function(num) {
    if(num === 0) return "0";
    let res = "", abs = Math.abs(num);
    while(abs > 0) {
        res = (abs%7) + res;
        abs = parseInt(abs/7);
    }
    return (num < 0) ? ("-" + res) : res;
};
