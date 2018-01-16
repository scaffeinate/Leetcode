/**
 * @param {number} num
 * @return {string}
 */
var toHex = function(num) {
    if(num === 0) return "0";
    const mappings = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'];
    let res = ""; 
    while(num !== 0) {
        res = mappings[(num & 15)] + res;
        num >>>= 4;
    }
    return res;
};
