/**
 * @param {number} n
 * @return {string}
 */
let aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
var convertToTitle = function(n) {
    if(n <= 26) {
        return aToZ[n-1];
    } else {
        let mod = (n % 26);
        let div = parseInt(n/26);
        return (mod == 0) ? (convertToTitle(div - 1) + "Z") : (convertToTitle(div) + (aToZ[mod-1]));
    }
};
